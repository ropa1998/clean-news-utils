package flusher.base;

import implementations.core.article.IArticle;

public interface ArticleFlusher {

    /**
     * @param article Flushes an article.
     */
    void flush(IArticle article);
}
