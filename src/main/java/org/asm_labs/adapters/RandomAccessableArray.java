package org.asm_labs.adapters;

import org.asm_labs.adapters.interfaces.RandomAccessable;

/** Этот класс является адаптером для интерфейса RandomAccessable<T>
 * @see RandomAccessable
 * Данный адаптер используется, если работа происходит с массивами
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public class RandomAccessableArray<T> implements RandomAccessable<T> {

    /** Массив данных */
    private T[] array;

    /**
     * Конструктор адаптера
     * @param array ссылка на массив
     */
    public RandomAccessableArray(T[] array) {
        this.array = array;
    }

    /**
     * Метод произвольного доступа к элементу по его индексу
     * @param index индекс элемента, который надо получить
     * @return элемент, находящий на позиции index.
     */
    @Override
    public T get(int index) {
        return this.array[index];
    }

    /**
     * Метод получения размера массива
     * @return размер массива
     */
    @Override
    public int size() {
        return this.array.length;
    }

    /**
     * Метод записи элемента на опеределенную позицию
     * @param index на какую позицию записать элемент
     * @param element какой элемент записать
     */
    @Override
    public void set(int index, T element) {
        this.array[index] = element;
    }
}
