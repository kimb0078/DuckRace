package HomePackage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    ArrayList<Integer> duckNumbers = new ArrayList<>();

    @Test
    void getDuckNumbers() {

        duckNumbers.add(45);
        assertFalse(duckNumbers.isEmpty());
    }
}