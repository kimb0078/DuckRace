package HomePackage;

import java.util.ArrayList;
import java.util.HashSet;

public class DuckNumberList {

    private HashSet<Integer> duckNumberList = new HashSet<>();

    public HashSet<Integer> getDuckNumbers(){
        return duckNumberList;
    }

    public int getSize(){
        return duckNumberList.size();
    }

    public void addNumber(int number){
        duckNumberList.add(number);
    }
}
