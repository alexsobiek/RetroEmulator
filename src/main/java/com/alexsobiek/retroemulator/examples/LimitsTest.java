package com.alexsobiek.retroemulator.examples;

import com.alexsobiek.retroemulator.emulator.Emulator;

public class LimitsTest {
    public static void main(String[] args) {
        Emulator emulator = new Emulator();
        emulator.printChar('A', 0, 0);
        emulator.printChar('B', 0, 39);
        emulator.printChar('C', 24, 0);
        emulator.printChar('D', 24, 39);
    }
}
