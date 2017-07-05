package org.asm_labs.files;

import org.asm_labs.adapters.interfaces.RandomAccessable;
import org.asm_labs.logic.interfaces.Sort;

import java.io.IOException;

/** Этот класс реализует паттерн Стратегия
 * Created by 217dr on 05.07.2017.
 */
public class InputModifier<T> {

    /** Поле конкретной сортировки */
    private Sort<T> sort;

    /**
     * Метод установки конкретной сортировки
     * @param sort конкретная сортировка
     */
    public void setSort(Sort<T> sort) {
        this.sort = sort;
    }

    /**
     * Метод принимающий на вход контейнер с данными,
     * затем реализует конкретную сортировку
     * @param randomAccessable контейнер с данными
     * @throws IOException
     */
    public void modify(RandomAccessable<T> randomAccessable) throws IOException {
        sort.sort(randomAccessable);
    }
}
