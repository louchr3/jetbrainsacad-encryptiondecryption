package encryptdecrypt.tasks;

public abstract class Encryption extends Task {

   @Override
   protected String readData(String data) {
      return dataReader.readData(data);
   }

   @Override
   protected void writeData(String data) {
      dataWriter.writeData(data);
   }
}
