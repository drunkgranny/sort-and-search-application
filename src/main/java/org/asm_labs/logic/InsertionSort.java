package org.asm_labs.logic;

import org.asm_labs.adapters.interfaces.RandomAccessable;
import org.asm_labs.logic.interfaces.Sort;

import java.io.IOException;
import java.util.Comparator;

/**
 * Created by 217dr on 03.07.2017.
 */
public class InsertionSort<T> implements Sort<T> {

    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(RandomAccessable<T> randomAccessable) throws IOException {
        int out, in;

        for (out = 1; out < randomAccessable.size(); out++) {
            T temp = randomAccessable.get(out);
            in = out;
            while (in > 0 && comparator.compare(randomAccessable.get(in - 1), temp) >= 0) {
                randomAccessable.set(in, randomAccessable.get(in - 1));
                --in;
            }
            randomAccessable.set(in, temp);
        }
    }
}
