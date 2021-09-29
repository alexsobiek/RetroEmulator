# Retro Emulator
This project serves as a learning tool to understand older text-based graphics, limited character sets, and screen 
memory with lines and columns. This "emulator" is based on a 640x480 display with 40 columns and 25 lines of character
space.

### Usage
```java
import com.alexsobiek.retroemulator.emulator.Emulator;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Call a new instance of the Emulator
        Emulator emulator = new Emulator();
        // Prints HELLO WORLD in blue
        emulator.printString("HELLO WORLD", 0, 0, Color.BLUE, Color.BLACK);
        // Prints V in the bottom left corner
        emulator.printChar('V', 24, 0);
    }
}
```

### Example
A more advanced Hello World example is included in the [examples pacakge](https://github.com/alexsobiek/RetroEmulator/tree/main/src/main/java/com/alexsobiek/retroemulator/examples)

<p align="center">
  <img alt="Hello World" src="https://raw.githubusercontent.com/alexsobiek/RetroEmulator/main/docs/helloworld.png">
</p>
