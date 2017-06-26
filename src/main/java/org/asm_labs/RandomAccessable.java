package org.asm_labs;

import java.io.IOException;

/**
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public interface RandomAccessable<T> {

    T get(int index) throws IOException;
    int size() throws IOException;
    void set(int index, T element) throws IOException;
    default void swap(int index1, int index2, RandomAccessable<T> randomAccessable) throws IOException {
        T temp;
        temp = randomAccessable.get(index1);
        randomAccessable.set(index1, randomAccessable.get(index2));
        randomAccessable.set(index2, temp);
    }
}
