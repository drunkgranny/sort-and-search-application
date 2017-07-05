package org.asm_labs.logic;

import org.asm_labs.adapters.interfaces.RandomAccessable;
import org.asm_labs.logic.interfaces.Sort;

import java.io.IOException;
import java.util.Comparator;

/**
 * Created by 217dr on 26.06.2017.
 */
public class SelectionSort<T> implements Sort<T> {

    private Comparator<T> comparator;

    public SelectionSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(RandomAccessable<T> randomAccessable) throws IOException {

        int i, j, min;

        for (i = 0; i < randomAccessable.size() -1; i++) {
            min = i;
            for (j = i + 1; j < randomAccessable.size(); j++) {
                if (comparator.compare(randomAccessable.get(j), randomAccessable.get(min)) < 0) {
                    min = j;
                }
                randomAccessable.swap(min, i);
            }
        }
    }
}
