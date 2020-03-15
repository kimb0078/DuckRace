package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KimberlyQueueTest {

    ArrayList<Duck> ducks = new ArrayList<>();

    @Test
    @BeforeEach
    void setDucks(){

        KimberlyQueue queue = new KimberlyQueue();

        for(int i = 0; i < 10;i++){
            queue.addToQueue();
        }
    }
    @Test
    void addToQueue() {

        assertEquals(1, ducks.get(0).getDuckNumber());
        assertNotEquals(3, ducks.get(1).getDuckNumber());
        assertEquals(3, ducks.get(2).getDuckNumber());
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