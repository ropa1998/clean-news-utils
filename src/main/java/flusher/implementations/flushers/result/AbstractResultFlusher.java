package flusher.implementations.flushers.result;

import flusher.base.AbstractFlusher;
import flusher.base.ResultFlusher;
import implementations.core.article.IArticle;
import implementations.core.cleanNewsResult.ICleanNewsResult;
import implementations.core.trend.ITrend;

import java.util.List;
import java.util.Map;

public abstract class AbstractResultFlusher extends AbstractFlusher implements ResultFlusher {


    /**
     * @param cleanNewsResult A template method for flushing cleanNewsResults, where the aspects that vary are the article flush and the trend flush.
     */
    @Override
    public void flush(ICleanNewsResult cleanNewsResult) {
        Map<ITrend, List<IArticle>> map = cleanNewsResult.getMap();
        for (ITrend trend : map.keySet()) {
            flush(trend);
            for (IArticle article : map.get(trend)) {
                flush(article);
            }
        }
    }


}
