package org.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("outFile.txt");
            String line= "This is the first line";
            byte[] bytes = line.getBytes();
            fileOutputStream.write(bytes);
//            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
