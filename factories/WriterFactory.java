package encryptdecrypt.factories;

import encryptdecrypt.writers.ConsoleDataWriter;
import encryptdecrypt.writers.DataWriter;
import encryptdecrypt.writers.TextFileDataWriter;

public class WriterFactory {
    public static DataWriter createWriter(String data) {
        if ("".equals(data)) {
            return new ConsoleDataWriter();
        }
        return new TextFileDataWriter(data);
    }
}
