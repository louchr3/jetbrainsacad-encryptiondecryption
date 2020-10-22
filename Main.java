package encryptdecrypt;

import encryptdecrypt.factories.ReaderFactory;
import encryptdecrypt.factories.TaskFactory;
import encryptdecrypt.factories.WriterFactory;
import encryptdecrypt.readers.DataReader;
import encryptdecrypt.tasks.Task;
import encryptdecrypt.writers.DataWriter;

/*
    A simple encryption and decryption program practicing to use
    factory, template and strategy pattern that were discussed in the
    section.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        String data = "";
        String mode = "enc";
        int key = 0;
        String in = "";
        String out = "";
        String alg = "shift";
        String readerType = "-data";

        for (int i = 0; i < args.length - 1; i += 2) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            } else if ("-data".equals(args[i])) {
                data = args[i + 1];
                in = "";
                readerType = "-data";
            } else if ("-in".equals(args[i]) && "".equals(data)) {
                in = args[i + 1];
                readerType = "-in";
            } else if ("-out".equals(args[i])) {
                out = args[i + 1];
            } else if ("-alg".equals(args[i])) {
                alg = args[i + 1];
            }
        }

        Task task = createTask(data, mode, key, in, out, alg, readerType);
        task.doTask();
    }

    public static Task createTask(String data, String mode, int key, String in, String out, String alg, String readerType) {
        DataReader dataReader = ReaderFactory.createReader(readerType);
        DataWriter dataWriter = WriterFactory.createWriter(out);
        Task task = TaskFactory.createModifier(mode, alg);
        task.setDataReader(dataReader);
        task.setDataWriter(dataWriter);
        task.setData(!"".equals(in) ? in : data);
        task.setKey(key);
        return task;
    }
}
