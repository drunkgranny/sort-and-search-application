package org.asm_labs;

import java.io.IOException;

/**
 * @author drunkgranny
 *         Date: 23.06.17.
 */

public interface Sort<T> {

    void sort(RandomAccessable<T> randomAccessable) throws IOException;

}
