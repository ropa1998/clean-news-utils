package flusher.implementations.trend;

import com.google.gson.Gson;
import implementations.core.trend.ITrend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class JsonTrendFlusher implements flusher.base.TrendFlusher {
    private final File file;
    private final Gson gson;

    public JsonTrendFlusher(File file) {
        this.file = file;
        this.gson = new Gson();
    }

    @Override
    public void flush(ITrend trend) {
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
            output.append(gson.toJson(trend));
            output.flush();
            output.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
