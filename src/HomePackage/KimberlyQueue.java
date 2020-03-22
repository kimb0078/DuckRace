package HomePackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Set;

public class KimberlyQueue {

    private ArrayList<Duck> ducks = new ArrayList<>();

    public void addDuckToQueue(){
        ducks.add(new Duck());
    }

    public void addSpecificDuckToQueue(Duck duck) {ducks.add(duck);}

    public void removeFromQueue(){
        if(ducks.size() > 0) {
            ducks.remove(0);
        }
        if(ducks.size() == 0){
            System.out.println("No ducks in queue");
        }
    }

    public int getNumberOfDucks(){
        return ducks.size();
    }

    public Duck getFromQueue() {
        while (ducks.size() > 0){
            Duck duck = ducks.get(0);
            ducks.remove(0);
            return duck;
        }
        return null;
    }

    public ArrayList<Integer> getDuckNumbers(){
        ArrayList<Integer> duckNumbers = new ArrayList<>();
        for(int i = 0; i < ducks.size(); i++){
            int number = ducks.get(i).getDuckNumber();
            duckNumbers.add(number);
        }
        return duckNumbers;
    }

}
