package flusher.implementations.flushers.full;

import flusher.base.AbstractFlusher;
import flusher.base.FullFlusher;
import implementations.core.article.IArticle;
import implementations.core.trend.ITrend;

import java.util.Set;

public abstract class AbstractFullFlusher extends AbstractFlusher implements FullFlusher {


    public void flush(Set<IArticle> articleSet, Set<ITrend> trendSet) {
        for (IArticle article : articleSet) {
            flush(article);
        }
        for (ITrend trend : trendSet) {
            flush(trend);
        }
    }

}
