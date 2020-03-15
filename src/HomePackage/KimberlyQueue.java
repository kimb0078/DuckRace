package HomePackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class KimberlyQueue {

    Generator generator;

    private ArrayList<Duck> ducks = new ArrayList<>();

    public void addToQueue(int i){
        ducks.add(i,new Duck(generator.generate()));
    }

    public void removeFromQueue(){
        if(ducks.size() > 0) {
            ducks.remove(0);
        }
        if(ducks.size() == 0){
            System.out.println("No ducks in queue.");
        }
    }

    public int getNumberOfDucks(){
        return ducks.size();
    }

}
