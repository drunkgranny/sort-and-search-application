package org.asm_labs;

import java.io.*;

/**
 * Created by ymaslov on 22.06.17.
 */
public class FileCreator {

    private String fileName = null;

    public FileCreator(String fileName) {
        this.fileName = fileName;
    }

    public File createFile() throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println(fileName + " file is created.");
        } else {
            System.out.println(fileName + " file already exists.");
        }
        return file;
    }

    public File fillTheFile(File file) throws IOException {
        long start = System.currentTimeMillis();
        Writer fw = new BufferedWriter(new FileWriter(file), 2 * 2048);
        for (long i = 0; i <= 5; i++) {
            String str = new RandomStringGenerator(12).nextString();
            fw.write(str + "\n");
        }
        fw.close();
        long elapsedTime = (System.currentTimeMillis() - start) / 60000;
        System.out.println(elapsedTime);
        return file;
    }


    public static void main(String[] args) throws IOException {
        FileCreator file = new FileCreator(args[0]);
        File myFile = file.createFile();
        file.fillTheFile(myFile);
    }

}
