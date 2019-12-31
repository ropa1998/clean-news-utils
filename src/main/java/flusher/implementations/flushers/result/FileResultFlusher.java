package flusher.implementations.flushers.result;


import flusher.implementations.article.FileArticleFlusher;
import flusher.implementations.trend.FileTrendFlusher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * A flusher that puts all of the content in a specific file
 */
public class FileResultFlusher extends AbstractResultFlusher {


    private File file;

    /**
     * @param path The path to the file where you want to save the result of the flusher
     */
    public FileResultFlusher(String path) {
        try {
            this.file = new File(path);
            if (!file.createNewFile()) {
                file.delete();
                file.createNewFile(); // if file already exists will do nothing
            }
            this.articleFlusher = new FileArticleFlusher(file);
            this.trendFlusher = new FileTrendFlusher(file);
            createHeader();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * @throws IOException Creates the header in the file with information of the date and time it was created
     */
    private void createHeader() throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(file, true));

        output.write("///////////////////////////////////////////////////////////////////");
        output.newLine();
        output.write("BEGINNING OF FILE");
        output.newLine();
        output.write("DATE: " + LocalDateTime.now().toString());
        output.newLine();
        output.write("///////////////////////////////////////////////////////////////////");

        output.newLine();

        output.flush();
        output.close();
    }


}
