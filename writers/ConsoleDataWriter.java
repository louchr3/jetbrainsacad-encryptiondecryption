package encryptdecrypt.writers;

public class ConsoleDataWriter extends DataWriter {
    @Override
    public void writeData(String data) {
        System.out.println(data);
    }
}
