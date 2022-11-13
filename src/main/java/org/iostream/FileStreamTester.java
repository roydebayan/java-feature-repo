package org.iostream;

import java.io.*;
import java.sql.SQLOutput;
import java.util.stream.Stream;

public class FileStreamTester {

    public static void main(String[] args) {
        try {
            Reader fileReader = new FileReader("outFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Stream<String> lines = bufferedReader.lines();
            String s = lines.findAny().get();
            System.out.println("s = " + s);
//            int read = fileReader.read();
//            System.out.println((char) read);
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
