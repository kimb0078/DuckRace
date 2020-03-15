package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DuckRaceTest {

    static DuckNumberList duckNumberList = DuckNumberList.getInstance();
    static ArrayList<KimberlyQueue> queueList = new ArrayList<KimberlyQueue>();

    @Test
    void checkDuckRace(){
        assertEquals(10, queueList.get(0).getNumberOfDucks());
        assertEquals(10, queueList.size());
    }

    @Test
    void nextRound(){
        for(int i = 0; i < queueList.size(); i++){
            Random random = new Random(1-);

        }
    }
    @Test
    void notNullTest() {
        assertNotNull(queueList);
    }

    @Test
    void correctNumberTest() {
        for(int i = 0; i < queueList.size(); i++){
            KimberlyQueue queue = queueList.get(i);
            assertEquals( 10, queue.getNumberOfDucks());
        }
    }

    @Test
    void removeTest(){
        queueList.remove(0);
        assertEquals(9, queueList.size());

        for(int i = 0; i < queueList.size(); i++){
            KimberlyQueue queue = queueList.get(i);
            queue.removeFromQueue();
            assertEquals(9, queue.getNumberOfDucks());
        }
    }

    @Test
    @AfterEach
    void clear(){
        while (!queueList.isEmpty()){
            queueList.remove(0);
        }
        assertTrue(queueList.isEmpty());

        duckNumberList.removeAllNumbers();
        assertEquals(0, duckNumberList.getSize());
    }
}