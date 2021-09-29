package com.alexsobiek.retroemulator.graphics;

import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {

    public byte[][][] screenMemory;
    private final int columns = 40;
    private final int lines = 25;

    /**
     * Constructor:
     * Creates a new window and begins painting
     */
    public Window() {
        // Initialize screen memory
        screenMemory = new byte[lines][columns][]; // 40 by 25 characters

        // Initialize our JFrame and add it to the JPanel
        JFrame frame = new JFrame("Retro Emulator");
        frame.setSize(640, 480); // VGA Resolution
        frame.add(this);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < lines; i++) {                   // loop through all lines
            for (int j = 0; j < columns; j++) {             // loop through each column on each line
                byte[] memory = screenMemory[i][j];         // grab the byte[] from the screen memory at line, column
                if (memory != null && memory[0] != 0x00) {  // Not null & not empty character
                    String s = String.valueOf(CharSet.toChar(memory[0]));
                    int x = j*16;       // Each new character moves over by 16px
                    int y = (i+1)*18;   // Each new character moves down by 18px
                    g2d.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14)); // Set the font size

                    // Background rectangle
                    g2d.setColor(new Color(memory[4] + 128, memory[5] + 128, memory[6] + 128));
                    g.fillRect(x, y - 16, 16, 18);

                    // Draw Character
                    g2d.setColor(new Color(memory[1] + 128, memory[2] + 128, memory[3] + 128));

                    /*
                    x coordinate calculation explanation:
                        each character has a width of 16px, so we subtract the width of the character from 16
                        to get the remaining pixels, then divide by two to calculate the pixels on each side,
                        and add to our x integer which is the starting point for this character.
                    */
                    g2d.drawString(s, ((16 - g2d.getFontMetrics().stringWidth(s)) / 2) + x, y-1);
                }
            }
        }
    }
}
