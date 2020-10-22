package encryptdecrypt.tasks;

public abstract class Decryption extends Task {
    @Override
    protected String readData(String input) {
        return dataReader.readData(input);
    }

    @Override
    protected void writeData(String data) {
        dataWriter.writeData(data);
    }
}
