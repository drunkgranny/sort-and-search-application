package org.asm_labs;

import java.io.*;
import java.util.Comparator;

/**
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public class BubbleSort<T> implements Sort<T> {

    private Comparator<T> comparator;

    public BubbleSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(RandomAccessable<T> randomAccessable) throws IOException {

            int j;
            boolean flag = true;   // set flag to true to begin first pass
            T temp;   //holding variable

            while (flag)
            {
                flag= false;    //set flag to false awaiting a possible swap
                for( j = 0;  j < randomAccessable.size() - 1;  j++ )
                {
                    if (comparator.compare(randomAccessable.get(j), randomAccessable.get(j + 1)) < 0)
                    {
                        temp = randomAccessable.get(j);                //swap elements
                        randomAccessable.set(j, randomAccessable.get(j + 1));
                        randomAccessable.set((j + 1), temp);
                        flag = true;              //shows a swap occurred
                    }
                }
            }
    }
}
