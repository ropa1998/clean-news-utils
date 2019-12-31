package flusher.implementations.trend;

import flusher.ConsoleConstants;
import flusher.base.TrendFlusher;
import implementations.core.trend.ITrend;

public class ConsoleTrendFlusher implements TrendFlusher, ConsoleConstants {
    @Override
    public void flush(ITrend trend) {
        System.out.println(ANSI_BLUE);
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("TREND");
        System.out.println(trend.getName());
        System.out.println("--------------------------------------");
        System.out.println("\n");
        System.out.println(ANSI_RESET);
    }
}
