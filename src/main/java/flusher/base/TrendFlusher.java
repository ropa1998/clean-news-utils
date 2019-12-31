package flusher.base;

import implementations.core.trend.ITrend;

public interface TrendFlusher {

    /**
     * @param trend Flushes a trend.
     */
    void flush(ITrend trend);
}
