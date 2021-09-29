package com.alexsobiek.retroemulator.examples;

import com.alexsobiek.retroemulator.emulator.Emulator;

import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        Emulator emulator = new Emulator();

        emulator.printString("HELLO", 0,0);
        emulator.printString("WORLD", 0,35);

        emulator.printString("+-------------------+", 10, 10, Color.BLACK, Color.LIGHT_GRAY);
        emulator.printString("|  RETRO EMULATOR   |", 11, 10, Color.BLACK, Color.LIGHT_GRAY);
        emulator.printString("| LOYOLA UNIVERSITY |", 12, 10, Color.BLACK, Color.LIGHT_GRAY);
        emulator.printString("+-------------------+", 13, 10, Color.BLACK, Color.LIGHT_GRAY);

        emulator.printString("HELLO", 24,0);
        emulator.printString("WORLD", 24,35);
    }
}
