package encryptdecrypt.tasks;

public class ShiftEncryption extends Encryption {
    @Override
    protected String modifyData(String data, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            boolean isLowerCase = c >= 'a' && c <= 'z';
            boolean isUppercase = c >= 'A' && c <= 'Z';
            if (isLowerCase || isUppercase) {
                int newChar = c + key;
                int lowerBound = isLowerCase ? 96 : 64;
                int upperBound = isLowerCase ? 122 : 90;
                if (newChar > upperBound) {
                    encrypted.append((char) (lowerBound + (newChar - upperBound)));
                } else {
                    encrypted.append((char) newChar);
                }
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}
