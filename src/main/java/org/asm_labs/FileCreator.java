package org.asm_labs;

import java.io.*;

/**Класс реализует создание файла
 * Файл содержит N строк длинной 12 символов + 1 символ '\n'
 * У данного класса одно состояние <b>fileName</b>
 * @author drunkgranny
 *         Date: 23.06.17.
 * @version 1.0
 */
public class FileCreator {

    /** Поле имени файла */
    private String fileName = null;

    /** Конуструктор - создание нового объекта с определенными значениями
     * @param fileName - имя файла
     */
    public FileCreator(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Метод создания файла
     * @return файл
     * @throws IOException
     */
    public File createFile() throws IOException {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println(fileName + " file is created.");
        } else {
            System.out.println(fileName + " file already exists.");
        }
        return file;
    }

    /**
     * Метод заполнения файла
     * @param file - файл
     * @throws IOException
     */
    public void fillTheFile(File file) throws IOException {
        long start = System.currentTimeMillis();
        Writer fw = new BufferedWriter(new FileWriter(file), 2 * 2048);
        for (long i = 0; i < 1000000; i++) {
            String str = new RandomStringGenerator(12).nextString();
            fw.write(str + "\n");
            fw.flush();
        }
        fw.close();
        long elapsedTime = (System.currentTimeMillis() - start) / 1000; // count in Millis
        System.out.println(elapsedTime);
    }

}
