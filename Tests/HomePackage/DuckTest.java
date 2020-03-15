package HomePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    DuckNumberList duckNumberList = DuckNumberList.getInstance();
    Generator generator = Generator.getInstance();

    private int duckNumber;

    @Test
    int getDuckNumber() {
        return duckNumber;
    }
}