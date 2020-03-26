package HomePackage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KimberlyQueueTest {

    private static ArrayList<Duck> ducks = new ArrayList<>();

    @Test
    @BeforeEach
    void addDuckToQueue() {
        ducks.clear();
        Duck duck = new Duck();
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        ducks.add(duck);
        ducks.add(duck1);
        ducks.add(duck2);
        assertEquals(duck, ducks.get(0));
        assertNotEquals(duck, ducks.get(1));
        assertEquals(duck2, ducks.get(2));

    }


    @ParameterizedTest
    @ValueSource(ints = {23}) //Tjekker om metoden tilføjer en bestem and med det rigtige nummer til køen
    public void addSpecificDuckToQueue(@ConvertWith(DuckConverter.class) Duck duck3) {
        ducks.add(duck3);
        assertEquals(23, ducks.get(3).getDuckNumber());
    }

    @Test
    void removeFromQueue() {
        if(ducks.size() > 0) {
            Object duck = ducks.get(0);
            ducks.remove(0);
            assertNotEquals(duck, ducks.get(0));
        }
        if(ducks.size() == 0){
            System.out.println("No ducks in queue.");
        }
    }

    @Test
    int getNumberOfDucks() {
        assertEquals(3, ducks.size());
        assertNotEquals(2,ducks.size());
        assertFalse(ducks.isEmpty());
        return ducks.size();
    }

    @Test
    ArrayList<Duck> getDucks(){
        return ducks;
    }

    @Test
    Duck getFromQueue() {
        if(ducks.size() > 0) {
            return ducks.get(0);
        }
        return null;
    }

    @Test
    ArrayList<Integer> getDuckNumbers(){
        ArrayList<Integer> duckNumbers = new ArrayList<>();
        for(int i = 0; i < ducks.size(); i++){
            duckNumbers.add(ducks.get(i).getDuckNumber());
        }
        return duckNumbers;
    }
}