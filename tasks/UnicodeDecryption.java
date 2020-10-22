package encryptdecrypt.tasks;

public class UnicodeDecryption extends Decryption {
    @Override
    protected String modifyData(String data, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            encrypted.append((char)(c - key));
        }
        return encrypted.toString();
    }
}
