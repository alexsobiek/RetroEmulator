package com.alexsobiek.retroemulator.examples;

import com.alexsobiek.retroemulator.emulator.Emulator;

import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        Emulator emulator = new Emulator();                                     // Call a new instance of the Emulator
        emulator.printString("HELLO WORLD", 0, 0, Color.BLUE, Color.BLACK);     // Prints HELLO WORLD in blue
    }
}
