package flusher.implementations.flushers.result;

import flusher.implementations.article.ConsoleArticleFlusher;
import flusher.implementations.trend.ConsoleTrendFlusher;

public class ConsoleResultFlusher extends AbstractResultFlusher {

    public ConsoleResultFlusher() {
        this.articleFlusher = new ConsoleArticleFlusher();
        this.trendFlusher = new ConsoleTrendFlusher();
    }
}
