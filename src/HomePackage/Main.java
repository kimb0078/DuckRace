package HomePackage;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    private static DuckNumberList duckNumberList = DuckNumberList.getInstance();

    public static void main(String[] args){

        try {
            DuckRace duckRace = DuckRace.getInstance();
            System.out.println("Ducks at Start");
            duckRace.printDucks();

            System.out.println("Ducks after round 1");
            duckRace.nextRound(9);
            duckRace.printDucks();

            System.out.println("Round 2");
            duckRace.nextRound(8);
            duckRace.printDucks();




        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }

   /* public void nextRound(int number){

        if(number < queueList.size()) {
            for (int i = 0; i < number; i++) {
                queueList2.add(i, new KimberlyQueue());
                KimberlyQueue queue2 = queueList2.get(i);
                KimberlyQueue queue = queueList.get(getRandomNumberInRange(0, number + 1));

                for (int j = 0; j < number; j++) {
                    Duck duck = queue.getFromQueue();
                    queue2.addSpecificDuckToQueue(duck);
                }
                assertEquals(9, queueList2.get(0).getNumberOfDucks());
            }
            queueList = queueList2;
        }
        else {
            System.out.println("Number of rounds needs to be smaller than " + queueList.size());
        }
    }

    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }




            /*
            ArrayList<KimberlyQueue> queues = new ArrayList<>();

            for(int i = 0; i < 10; i++){
                queues.add(new KimberlyQueue());
            }

            System.out.println(queues);
            KimberlyQueue queue = new KimberlyQueue();

            System.out.println("Adding 25 ducks to the queue");
            for (int i = 0; i < 25; i++) {
                queue.addToQueue();
            }

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");

            queue.removeFromQueue();
            System.out.println("The first duck has reached the finish line!");

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");

             */

}
