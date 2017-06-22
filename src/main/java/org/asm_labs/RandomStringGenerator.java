package org.asm_labs;

import java.util.Random;

/**
 * Created by ymaslov on 22.06.17.
 */
public class RandomStringGenerator {

    private static final char[] symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
    private final Random random = new Random();
    private final char[] buf;


    public RandomStringGenerator(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("length < 1: " + length);
        }
        buf = new char[length];
    }

    public String nextString() {
        for (int i = 0; i < buf.length; i++) {
            buf[i] = symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }

}
