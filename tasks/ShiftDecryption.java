package encryptdecrypt.tasks;

public class ShiftDecryption extends Decryption {
    @Override
    protected String modifyData(String data, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            boolean isLowerCase = c >= 'a' && c <= 'z';
            boolean isUppercase = c >= 'A' && c <= 'Z';
            if (isLowerCase || isUppercase) {
                int newChar = c - key;
                int lowerBound = isLowerCase ? 97 : 65;
                int upperBound = isLowerCase ? 123 : 91;
                if (newChar < lowerBound) {
                    encrypted.append((char) (upperBound - (lowerBound - newChar)));
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
