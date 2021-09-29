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
        Emulator emulator = new Emulator();                                     // Call a new instance of the Emulator
        emulator.printString("HELLO WORLD", 0, 0, Color.BLUE, Color.BLACK);     // Prints HELLO WORLD in blue
    }
}
```

