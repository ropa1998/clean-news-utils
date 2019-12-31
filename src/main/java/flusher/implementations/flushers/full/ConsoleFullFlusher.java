package flusher.implementations.flushers.full;

import flusher.implementations.article.ConsoleArticleFlusher;
import flusher.implementations.trend.ConsoleTrendFlusher;

public class ConsoleFullFlusher extends AbstractFullFlusher {

    public ConsoleFullFlusher() {
        this.articleFlusher = new ConsoleArticleFlusher();
        this.trendFlusher = new ConsoleTrendFlusher();
    }
}
