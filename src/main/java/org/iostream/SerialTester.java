package org.iostream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTester {

    public static void main(String[] args) {
        try(FileOutputStream outStream = new FileOutputStream("outStream.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream)
            ) {

            SerialFileOutput object = new SerialFileOutput("Robert");
            objectOutputStream.writeObject(object);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
