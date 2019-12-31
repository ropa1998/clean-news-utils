package flusher.implementations.flushers.full;

import flusher.implementations.article.JsonArticleFlusher;
import flusher.implementations.trend.JsonTrendFlusher;

import java.io.File;

public class JsonFullFlusher extends AbstractFullFlusher {


    public JsonFullFlusher(String path) {
        try {
            File file = new File(path);
            if (!file.createNewFile()) {
                file.delete();
                file.createNewFile(); // if file already exists will do nothing
            }
            this.articleFlusher = new JsonArticleFlusher(file);
            this.trendFlusher = new JsonTrendFlusher(file);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
