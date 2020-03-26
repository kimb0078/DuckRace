package HomePackage;

import java.util.ArrayList;

public class KimberlyQueue {

    //"Hjemmelavet" Queue, hvor ænder bliver sat ind i en ArrayList, som kun modtager objekter af Duck-klassen
    private ArrayList<Duck> ducks = new ArrayList<>();

    //Tilføjer en ny Duck instans til køen
    public void addDuckToQueue(){
        ducks.add(new Duck());
    }

    //tilføjer en and, som er blevet instansieret i en tidligere runde til en kø
    public void addSpecificDuckToQueue(Duck duck) {ducks.add(duck);}

    //fjerner den første and fra køen (blev kun brugt i Del 1 af Duck Race opgaven)
    public void removeFromQueue(){
        if(ducks.size() > 0) {
            ducks.remove(0);
        }
        if(ducks.size() == 0){
            System.out.println("No ducks in queue.");
        }
    }

    //Getter til antallet af ænder i en KimberlyQueue
    public int getNumberOfDucks(){
        return ducks.size();
    }

    //Henter den første and i køen og fjerner den derefter
    public Duck getFromQueue() {
        while (ducks.size() > 0){
            Duck duck = ducks.get(0);
            ducks.remove(0);
            return duck;
        }
        return null; //returnerer null, hvis alle ænder i køen er blevet fjernet
    }

    //Henter alle ændernes numre og sender dem i en ArrayListe af integers
    public ArrayList<Integer> getDuckNumbers(){
        ArrayList<Integer> duckNumbers = new ArrayList<>();
        for(int i = 0; i < ducks.size(); i++){
            int number = ducks.get(i).getDuckNumber();
            duckNumbers.add(number);
        }
        return duckNumbers;
    }

}
