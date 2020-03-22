package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static ArrayList<KimberlyQueue> queueList = new ArrayList<KimberlyQueue>();
    private static ArrayList<KimberlyQueue> queueList2 = new ArrayList<KimberlyQueue>();

    @Test
    @BeforeEach
    void setup(){
        for(int j = 0; j < 10; j++) {
            queueList.add(j, new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addDuckToQueue();
            }
        }
    }

    @Test
    void nextRound(int number){
        for(int i = 0; i < number; i++){
            queueList2.add(i, new KimberlyQueue());
            KimberlyQueue queue2 = queueList2.get(i);
            KimberlyQueue queue = queueList.get(getRandomNumberInRange(0,number + 1));

            for(int j = 0; j < number; j++) {
                Duck duck = queue.getFromQueue();
                queue2.addSpecificDuckToQueue(duck);
            }
            assertEquals(9, queueList2.get(0).getNumberOfDucks());
        }
        queueList = queueList2;

        assertEquals(9, queueList.size());

    }

    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
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
    }







}