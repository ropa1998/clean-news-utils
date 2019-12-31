package flusher.implementations.article;

import flusher.ConsoleConstants;
import flusher.base.ArticleFlusher;
import implementations.core.article.IArticle;

public class ConsoleArticleFlusher implements ArticleFlusher, ConsoleConstants {
    @Override
    public void flush(IArticle article) {
        System.out.println(ANSI_GREEN);
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("TITLE");
        System.out.println(article.getTitle());
        System.out.println("--------------------------------------");
        System.out.println("BODY");
        System.out.println(article.getBody());
        System.out.println("--------------------------------------");
        System.out.println("MEDIUM");
        System.out.println(article.getMedium().getName());
        System.out.println("--------------------------------------");
        System.out.println("\n");
        System.out.println(ANSI_RESET);
    }
}
