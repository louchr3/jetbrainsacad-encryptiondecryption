package encryptdecrypt.factories;

import encryptdecrypt.tasks.*;

public class TaskFactory {
    public static Task createModifier(String type, String algo) {
        if ("enc".equals(type) && "shift".equals(algo)) {
            return new ShiftEncryption();
        } else if ("enc".equals(type) && "unicode".equals(algo)) {
            return new UnicodeEncryption();
        } else if ("dec".equals(type) && "shift".equals(algo)) {
            return new ShiftDecryption();
        } else if ("dec".equals(type) && "unicode".equals(algo)) {
            return new UnicodeDecryption();
        }
        return "enc".equals(type) ? new ShiftEncryption() : new ShiftDecryption();
    }
}
