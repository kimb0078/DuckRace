package HomePackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {


    Generator generator = Generator.getInstance();

    private int duckNumber;

    @Test
    @BeforeEach
    void setup(){
        Duck duck = new Duck();
    }

    @Test
    int getDuckNumber() {
        assertEquals(1, duckNumber);
        return duckNumber;
    }
}