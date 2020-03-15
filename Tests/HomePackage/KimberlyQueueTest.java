package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KimberlyQueueTest {

    ArrayList<Duck> ducks = new ArrayList<>();

    //
    @Test
    void addToQueue() {

        System.out.println(ducks.get(1));
        assertEquals(1, ducks.get(0));
        assertNotEquals(3, ducks.get(1));
        assertEquals(3, ducks.get(2));
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
    void getNumberOfDucks() {
        assertEquals(10, ducks.size());
        assertNotEquals(2,ducks.size());
        assertFalse(ducks.isEmpty());

    }

    @Test
    ArrayList<Duck> getDuckNumbers(){
        return ducks;
    }
}