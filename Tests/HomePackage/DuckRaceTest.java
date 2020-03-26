package HomePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DuckRaceTest {

    private static ArrayList<KimberlyQueue> queueList = new ArrayList<KimberlyQueue>();
    private static ArrayList<KimberlyQueue> queueList2 = new ArrayList<KimberlyQueue>();

    private static DuckRace duckRace = new DuckRace();

    @Test
    @BeforeEach
    void setup(){ //Opretter 10 lister med 10 ænder i hver liste, som skal bruges til alle de efterfølgende tests.
        for(int j = 0; j < 10; j++) {
            queueList.add(j, new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addDuckToQueue();
            }
        }
    }
    @Test
    static DuckRace getInstance() {
        //Tester om getInstance returnerer duckRace objektet
        assertEquals(duckRace, getInstance());
        return duckRace;
    }

    @Test
    void nextRound(){
        int number = 9;
        if(number < queueList.size()) {
            for (int i = 0; i < number; i++) {
                queueList2.add(i, new KimberlyQueue());
                KimberlyQueue queue2 = queueList2.get(i);

                for (int j = 0; j < number; j++) {
                    KimberlyQueue randomQueue = queueList.get(getRandomNumberInRange(0, number));
                    Duck duck = randomQueue.getFromQueue();
                    if(duck == null){
                        j--;
                    }
                    else{
                        queue2.addSpecificDuckToQueue(duck);
                    }
                }
            }
            queueList.clear();
            queueList.addAll(queueList2);
            queueList2.clear();

            //Tester at der bliver oprettet 9 queues med 9 ænder i hver
            assertEquals(9, queueList.get(0).getNumberOfDucks());
            assertEquals(9, queueList.size());
        }
        else {
            System.out.println("Number of rounds needs to be smaller than " + queueList.size());
        }

    }

    @Test
     //Denne metode blev fundet på https://mkyong.com/java/java-generate-random-integers-in-a-range/
    //Derfor har jeg ikke testet det, da jeg har prøvet at følge TDD
    int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Test //Tjekker at queueList ikke er tom
    void notNullTest() {
        assertNotNull(queueList);
    }

    @Test
    void correctNumberTest() { //Tjekker at der er 10 ænder i alle 10 queues
        for(int i = 0; i < queueList.size(); i++){
            KimberlyQueue queue = queueList.get(i);
            assertEquals( 10, queue.getNumberOfDucks());
        }
    }

    @Test
    void printDucks(){ //Tjekker at alle queues, som bliver printet fra queueList, indholder noget
        for (KimberlyQueue queue : queueList) {
            System.out.println(queue.getDuckNumbers());
            assertNotNull(queue);
        }
    }

    @Test
    @AfterEach
    void clear(){ //Rydder queueList efter hver test
        while (!queueList.isEmpty()){
            queueList.remove(0);
        }
        assertTrue(queueList.isEmpty());
    }
}