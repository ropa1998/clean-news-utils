package flusher.implementations.article;

import flusher.base.ArticleFlusher;
import implementations.core.article.IArticle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileArticleFlusher implements ArticleFlusher {

    private File file;

    public FileArticleFlusher(File file) {
        this.file = file;
    }

    @Override
    public void flush(IArticle article) {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
            output.append("--------------------------------------");
            output.newLine();
            output.append("TITLE");
            output.newLine();
            output.append(article.getTitle());
            output.newLine();
            output.append("--------------------------------------");
            output.newLine();
            output.append("BODY");
            output.newLine();
            output.append(article.getBody());
            output.newLine();
            output.append("--------------------------------------");
            output.newLine();
            output.append("MEDIUM");
            output.newLine();
            output.append(article.getMedium().getName());
            output.newLine();
            output.append("--------------------------------------");
            output.newLine();
            output.newLine();
            output.flush();
            output.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
