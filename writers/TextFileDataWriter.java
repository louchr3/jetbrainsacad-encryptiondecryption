package encryptdecrypt.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDataWriter extends DataWriter {

    private String path;

    public TextFileDataWriter(String path) {
        this.path = path;
    }

    @Override
    public void writeData(String data) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
