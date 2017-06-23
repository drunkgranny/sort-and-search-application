package org.asm_labs;

/**
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public class RandomAccessableArray<T> implements RandomAccessable<T> {

    private T[] array;

    public RandomAccessableArray(T[] array) {
        this.array = array;
    }

    @Override
    public T get(int index) {
        return this.array[index];
    }

    @Override
    public int size() {
        return this.array.length;
    }

    @Override
    public void set(int index, T element) {
        this.array[index] = element;
    }
}
