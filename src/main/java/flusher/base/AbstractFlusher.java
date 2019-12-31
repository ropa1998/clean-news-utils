package flusher.base;

import implementations.core.article.IArticle;
import implementations.core.trend.ITrend;

public abstract class AbstractFlusher {

    protected ArticleFlusher articleFlusher;
    protected TrendFlusher trendFlusher;


    public void flush(ITrend trend) {
        trendFlusher.flush(trend);
    }

    public void flush(IArticle article) {
        articleFlusher.flush(article);
    }

}
