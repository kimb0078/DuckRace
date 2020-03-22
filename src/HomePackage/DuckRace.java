package HomePackage;
import java.util.ArrayList;
import java.util.Random;

public class DuckRace {

    private static ArrayList<KimberlyQueue> queueList = new ArrayList<>();
    private static ArrayList<KimberlyQueue> queueList2 = new ArrayList<>();

    private static DuckRace duckRace = new DuckRace();

    public DuckRace(){
        for(int j = 0; j < 10; j++) {
            queueList.add(j, new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addDuckToQueue();
            }
        }
    }

    public static DuckRace getInstance() {
        return duckRace;
    }


    //Denne metode blev fundet på https://mkyong.com/java/java-generate-random-integers-in-a-range/
    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public void nextRound(int number){

        if(number < queueList.size()) {
            for (int i = 0; i < number; i++) {
                queueList2.add(i, new KimberlyQueue());
                KimberlyQueue queue2 = queueList2.get(i);

                for (int j = 0; j < number; j++) {
                    KimberlyQueue randomQueue = queueList.get(getRandomNumberInRange(0, number - 1));
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

        }
        else {
            System.out.println("Number of rounds needs to be smaller than " + queueList.size());
        }

    }

    public void printDucks(){
        for (KimberlyQueue queue : queueList) {
            System.out.println(queue.getDuckNumbers());
        }
    }

}
