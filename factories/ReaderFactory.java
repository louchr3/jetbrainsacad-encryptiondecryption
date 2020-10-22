package encryptdecrypt.factories;

import encryptdecrypt.readers.DataReader;
import encryptdecrypt.readers.InputDataReader;
import encryptdecrypt.readers.TextFileDataReader;

public class ReaderFactory {
    public static DataReader createReader(String type) {
        if ("-in".equals(type)) {
            return new TextFileDataReader();
        }
        return new InputDataReader();
    }
}
