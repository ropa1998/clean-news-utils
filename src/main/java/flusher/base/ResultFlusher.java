package flusher.base;

import flusher.base.ArticleFlusher;
import flusher.base.TrendFlusher;
import implementations.core.cleanNewsResult.ICleanNewsResult;

public interface ResultFlusher extends TrendFlusher, ArticleFlusher {

    /**
     * @param cleanNewsResult Flushes a cleanNewsResult.
     */
    void flush(ICleanNewsResult cleanNewsResult);


}
