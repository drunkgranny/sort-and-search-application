package org.asm_labs.adapters;

import org.asm_labs.adapters.interfaces.RandomAccessable;

import java.io.IOException;
import java.io.RandomAccessFile;

/** Этот класс является адаптером для интерфейса RandomAccessable<T>
 * @see RandomAccessable
 * Данный адаптер используется, если работа идет с файлом
 * Created by 217dr on 26.06.2017.
 */
public class RandomAccessableFile implements RandomAccessable<String> {


    /** Поле контейнера с данными */
    private RandomAccessFile randomAccessFile;

    /**
     * Конструктор контейнера данных для файла
     * @param randomAccessFile контейнер данных
     */
    public RandomAccessableFile(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }


    /**
     * Метод получения произвольного элемента из файла
     * @param index индекс элемента, который надо получить
     * @return строку по произвольному индексу
     * @throws IOException
     */
    @Override
    public String get(int index) throws IOException {
        randomAccessFile.seek(index * (12 + 1));
        return randomAccessFile.readLine();
    }

    /**
     * Метод получения количества строк в файле
     * @return количество строк в файле
     * @throws IOException
     */
    @Override
    public int size() throws IOException {
        return (int)Math.floor(randomAccessFile.length() / (12 + 1));
    }

    /**
     * Метод записи строки по индексу в файл
     * @param index на какую позицию записать элемент
     * @param element какую строку записать
     * @throws IOException
     */
    @Override
    public void set(int index, String element) throws IOException {
        randomAccessFile.seek(index * (12 + 1));
        byte[] bytes = element.getBytes();
        randomAccessFile.write(bytes);
    }
}
