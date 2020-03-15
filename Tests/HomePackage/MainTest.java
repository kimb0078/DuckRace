package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   static DuckNumberList duckNumberList;
   static ArrayList<KimberlyQueue> queueList = new ArrayList();
    //ArrayList<KimberlyQueue> queueList = new ArrayList();


    @Test
    @BeforeAll
    void mainSetup() throws NullPointerException{


        for(int j = 0; j < 10; j++) {
            queueList.add(j,new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addToQueue(i);
            }
            assertEquals(10, queueList.get(j).getNumberOfDucks());
        }
        assertEquals(10, queueList.size());
        System.out.println(duckNumberList.getDuckNumbers());
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
            assertEquals(9, queueList.get(i).getNumberOfDucks());
        }

        System.out.println(duckNumberList.getDuckNumbers());
    }

    @Test
    @AfterEach
    void clear(){
        while (!queueList.isEmpty()){
            queueList.remove(0);
        }
        assertTrue(queueList.isEmpty());
    }


        /*
        queue.removeFromQueue();

        assertEquals(24,queue.getNumberOfDucks());
        */


}