package org.asm_labs;

import java.io.IOException;

/** Итерфейс произвольного доступа к структуре данных любого типа
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public interface RandomAccessable<T> {

    /** Метод получения произвольного элемента по индексу
     *
     * @param index индекс элемента, который надо получить
     * @return элемент
     * @throws IOException
     */
    T get(int index) throws IOException;

    /**
     * Метод получения количество элементов в структуре данных
     * @return количество элементов
     * @throws IOException
     */
    int size() throws IOException;

    /**
     * Метод записи элемента в структуру данных по индексу
     * @param index на какую позицию записать элемент
     * @param element какой элемент записать
     * @throws IOException
     */
    void set(int index, T element) throws IOException;

    /**
     * Метод обмена элементами
     * @param index1 первый элемент
     * @param index2 второй элемент
     * @throws IOException
     */
    default void swap(int index1, int index2) throws IOException {
        T temp;
        temp = get(index1);
        set(index1, get(index2));
        set(index2, temp);
    }
}
