package HomePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    DuckNumberList duckNumberList;

    private int duckNumber;

    DuckTest(){
        duckNumber = duckNumberList.getSize() + 1;
        duckNumberList.addNumber(duckNumber);
    }

    @Test
    int getDuckNumber() {
        return duckNumber;
    }

    @Test
    void setDuckNumber(int duckNumber) {
        this.duckNumber = duckNumber;
    }
}