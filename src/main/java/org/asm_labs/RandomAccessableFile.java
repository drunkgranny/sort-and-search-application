package org.asm_labs;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by 217dr on 26.06.2017.
 */
public class RandomAccessableFile implements RandomAccessable<String> {

    private RandomAccessFile randomAccessFile;

    public RandomAccessableFile(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override
    public String get(int index) throws IOException {
        randomAccessFile.seek(index * (12 + 1));
        return randomAccessFile.readLine();
    }

    @Override
    public int size() throws IOException {
        return (int)Math.floor(randomAccessFile.length() / (12 + 1));
    }

    @Override
    public void set(int index, String element) throws IOException {
        randomAccessFile.seek(index * (12 + 1));
        byte[] bytes = element.getBytes();
        randomAccessFile.write(bytes);
    }
}
