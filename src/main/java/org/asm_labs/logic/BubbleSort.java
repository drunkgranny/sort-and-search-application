package org.asm_labs.logic;

import org.asm_labs.adapters.interfaces.RandomAccessable;
import org.asm_labs.logic.interfaces.Sort;

import java.io.*;
import java.util.Comparator;

/**Класс, реализующий интерфейс Sort
 * Этот класс реализует пузырьковую сортировку
 * У данного класса одно состояние <b>comparator</b>
 * @author drunkgranny
 *         Date: 23.06.17.
 * @version 1.0
 * @see Sort <T>#sort(RandomAccessable<T> randomAccessable)
 */
public class BubbleSort<T> implements Sort<T> {

    /** Поле comparator */
    private Comparator<T> comparator;

    /** Конструктор - создание нового объекта с определенными значениями
     * @param comparator - компаратор
     */
    public BubbleSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /** Метод реализующий интерфейс Sort
     * @see Sort<T>#sort(RandomAccessable<T> randomAccessable)
     */
    @Override
    public void sort(RandomAccessable<T> randomAccessable) throws IOException {

            int j;
            boolean flag = true;   // set flag to true to begin first pass

            while (flag)
            {
                flag= false;    //set flag to false awaiting a possible swap
                for(j = 0;  j < randomAccessable.size() - 1;  j++)
                {
                    if (comparator.compare(randomAccessable.get(j), randomAccessable.get(j + 1)) > 0)
                    {
                        randomAccessable.swap(j, j+1);
                        flag = true;              //shows a swap occurred
                    }
                }
            }
    }
}
