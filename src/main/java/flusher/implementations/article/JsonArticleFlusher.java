package flusher.implementations.article;

import com.google.gson.Gson;
import implementations.core.article.IArticle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class JsonArticleFlusher implements flusher.base.ArticleFlusher {

    private File file;
    private Gson gson;

    public JsonArticleFlusher(File file) {
        this.file = file;
        this.gson = new Gson();
    }

    @Override
    public void flush(IArticle article) {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
            output.append(gson.toJson(article));
            output.flush();
            output.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
