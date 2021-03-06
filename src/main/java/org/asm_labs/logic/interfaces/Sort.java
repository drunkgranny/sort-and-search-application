package org.asm_labs.logic.interfaces;

import org.asm_labs.adapters.interfaces.RandomAccessable;

import java.io.IOException;

/** Интерфейс сортировки для любых любых данных
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public interface Sort<T> {

    /** Метод сортировки элементов
     *
     * @param randomAccessable объект содержащий элементы для сортировки
     * @throws IOException
     */
    void sort(RandomAccessable<T> randomAccessable) throws IOException;

}
