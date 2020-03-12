package HomePackage;

import java.util.ArrayList;

public class Duck {


    private ArrayList<Integer> duckNumbers = new ArrayList<>();

    public Duck() {
        duckNumbers.add((duckNumbers.size()+1));
    }

    public ArrayList<Integer> getDuckNumbers() {
        return duckNumbers;
    }
}
