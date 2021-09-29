package com.alexsobiek.retroemulator.emulator;

import com.alexsobiek.retroemulator.graphics.CharSet;
import com.alexsobiek.retroemulator.graphics.Window;

import java.awt.*;

public class Emulator {

    private final Window window;

    public Emulator() {
        window = new Window();
    }

    /**
     * Prints a string starting at the specified line and column
     * @param string String to print
     * @param line Line to start at
     * @param column Column to start at
     */
    public void printString(String string, int line, int column) {
        printString(string, line, column, Color.WHITE, Color.BLACK);
    }

    /**
     * Prints a string starting at the specified line and column
     * @param string String to print
     * @param line Line to start at
     * @param column Column to start at
     * @param foreground Foreground color
     * @param background Background color
     */
    public void printString(String string, int line, int column, Color foreground, Color background) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            printChar(chars[i], line, column+i, foreground, background);
        }
    }

    /**
     * Prints a char at the specified line and column
     * @param character char to print
     * @param line line to print on
     * @param column column to print on
     */
    public void printChar(char character, int line, int column) {
        printChar(character, line, column, Color.WHITE, Color.BLACK);
    }

    /**
     * Prints a char at the specified line and column
     * @param character char to print
     * @param line line to print on
     * @param column column to print on
     * @param foreground Foreground color
     * @param background Background color
     */
    public void printChar(char character, int line, int column, Color foreground, Color background) {
        if (CharSet.contains((byte) character)) {
            byte[] b = new byte[]{
                    (byte) character,
                    (byte) ((byte) foreground.getRed() - 128), // Subtract 128 since we need all 256 bits (unsigned)
                    (byte) ((byte) foreground.getGreen() - 128),
                    (byte) ((byte) foreground.getBlue() - 128),
                    (byte) ((byte) background.getRed() - 128),
                    (byte) ((byte) background.getGreen() - 128),
                    (byte) ((byte) background.getBlue() - 128),
            };
            window.screenMemory[line][column] = b;
        }
    }
}
