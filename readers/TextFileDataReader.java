package encryptdecrypt.readers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFileDataReader extends DataReader {
    @Override
    public String readData(String path) {
        File file = new File(path);
        String data = "";
        try (Scanner scanner = new Scanner(file)) {
            data = scanner.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
