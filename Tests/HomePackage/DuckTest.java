package HomePackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.converter.ArgumentConverter;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {


    Generator generator = Generator.getInstance();

    private int duckNumber;

    //Hvordan tester man en constructor som Duck()?

    @Test
    @BeforeEach
    void setup(){
        Duck duck = new Duck();
    }

    @Test //Hvordan tester man en getter? Der sker ikke så meget i den
    int getDuckNumber() {
        assertNotNull(duckNumber);
        return duckNumber;
    }
}