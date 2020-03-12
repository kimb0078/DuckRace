package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    ArrayList<Duck> ducks = new ArrayList<>();

    @Test
    void addToQueue() {
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

    @Test
    void removeFromQueue() {
        if(ducks.size() > 0) {
            Object duck = ducks.get(0);
            ducks.remove(0);
            assertNotEquals(duck, ducks.get(0));
        }
        else{
            System.out.println("No ducks in queue.");
        }
    }

    @Test
    void getNumberOfDucks() {
        ducks.add(new Duck());
        assertEquals(1, ducks.size());
        assertNotEquals(2,ducks.size());
        assertFalse(ducks.isEmpty());

    }
}