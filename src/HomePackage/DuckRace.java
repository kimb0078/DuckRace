package HomePackage;
import java.util.ArrayList;
import java.util.Random;

public class DuckRace {

    private static ArrayList<KimberlyQueue> queueList = new ArrayList<>();
    private static ArrayList<KimberlyQueue> queueList2 = new ArrayList<>();

    //DuckRace er en singleton, så dens constructor bliver kun kaldt en enkelt gang
    // for at oprette andeløbet i starten af spillet
    private static DuckRace duckRace = new DuckRace();

    //Spillet starter med 10 KimberlyQueue's med 10 ænder hver, som bliver oprettet indenfor en ArrayList
    //Vi får derfor en ArrayList af KimberlyQueues af Duck-objekter, som alle automatisk får et duckNumber
    public DuckRace(){
        for(int j = 0; j < 10; j++) {
            queueList.add(j, new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addDuckToQueue();
            }
        }
    }

    //Bruges til at hente instansen af DuckRace
    public static DuckRace getInstance() {
        return duckRace;
    }

    //Opretter den næste runde med et givent antal queues og antal ænder i hver queue
    public void nextRound(int number){

        if(number < queueList.size()) {
            for (int i = 0; i < number; i++) {
                queueList2.add(i, new KimberlyQueue());
                KimberlyQueue queue2 = queueList2.get(i);

                for (int j = 0; j < number; j++) {
                    //Metoden henter en and fra en tilfældig kø i queueList og sætter den ind i en ny kø
                    //indtil man har nået n*n
                    KimberlyQueue randomQueue = queueList.get(getRandomNumberInRange(0, number));
                    Duck duck = randomQueue.getFromQueue();
                    if(duck == null){
                        j--; //hvis køen den henter fra er blevet tom
                    }
                    else{
                        queue2.addSpecificDuckToQueue(duck);
                    }
                }
            }
            //Derefter bliver queueList ryddet og får alle queues fra queueList2
            queueList.clear();
            queueList.addAll(queueList2);
            //queueList2 ryddes så den er tom til næste runde
            queueList2.clear();
        }
        else { //Der skal være færre køer i den nye runde end antal køer i den nuværende køliste
            System.out.println("Number of queues needs to be smaller than " + queueList.size());
        }
    }

    //Denne metode blev fundet på https://mkyong.com/java/java-generate-random-integers-in-a-range/
    //Den giver et tilfældigt tal mellem et minimum og maksimum
    //Den bliver brugt i nextRound() for at hente et tal fra en tilfældig liste i queueList
    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //Printer alle ændernes numre for hver kø i queueList
    //println gør at hver køs numre bliver printet på en ny linje
    public void printDucks(){
        for (KimberlyQueue queue : queueList) {
            System.out.println(queue.getDuckNumbers());
        }
    }

}
