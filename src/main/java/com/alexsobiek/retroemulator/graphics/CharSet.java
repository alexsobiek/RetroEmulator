package com.alexsobiek.retroemulator.graphics;

public class CharSet {

    public static byte[] chars = new byte[]{ // This defines the usable character set using UTF-8
            0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x4d,
            0x4e, 0x4f, 0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5a,
            0x2b, 0x2c, 0x2d, 0x2e, 0x20, 0x22, 0x27, 0x7c
    };

    /**
     * Returns whether the supplied UTF-8 byte is defined in the character set or not
     * @param b UTF-8 Byte
     * @return boolean
     */
    public static boolean contains(byte b) {
        boolean contains = false;
        int i = 0;
        while(!contains && i < chars.length) {
            contains = (b == chars[i]);
            i++;
        }
        return contains;
    }

    /**
     * Converts byte to UTF-8 char
     * @param b byte to convert
     * @return char
     */
    public static char toChar(byte b) {
        return (char) b;
    }
}
