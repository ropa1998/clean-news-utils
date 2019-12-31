package flusher.implementations.trend;

import flusher.base.TrendFlusher;
import implementations.core.trend.ITrend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileTrendFlusher implements TrendFlusher {

    private File file;

    public FileTrendFlusher(File file) {
        this.file = file;
    }


    @Override
    public void flush(ITrend trend) {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
            output.append("--------------------------------------");
            output.newLine();
            output.append("TREND");
            output.newLine();
            output.append(trend.getName());
            output.newLine();
            output.append("--------------------------------------");
            output.flush();
            output.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
