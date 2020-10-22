package encryptdecrypt.tasks;

import encryptdecrypt.readers.DataReader;
import encryptdecrypt.writers.DataWriter;

public abstract class Task {

    private String data;
    private int key;
    protected DataReader dataReader;
    protected DataWriter dataWriter;

    public void setDataReader(DataReader dataReader) {
        this.dataReader = dataReader;
    }
    public void setDataWriter(DataWriter dataWriter) {
        this.dataWriter = dataWriter;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setKey(int key) {
        this.key = key;
    }

    protected abstract String readData(String input);
    protected abstract String modifyData(String data, int key);
    protected abstract void writeData(String data);

    public void doTask() {
        String inputData = readData(data);
        String modifiedData = modifyData(inputData, key);
        writeData(modifiedData);
    }
}
