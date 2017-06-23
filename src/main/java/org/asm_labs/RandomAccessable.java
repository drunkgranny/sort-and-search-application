package org.asm_labs;

/**
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public interface RandomAccessable<T> {

    T get(int index);
    int size();
    void set(int index, T element);

}
