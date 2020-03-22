package HomePackage;

import java.util.*;

public class DuckNumberList {

    private HashMap<Integer,Duck> duckNumberList = new HashMap<>();

    private static DuckNumberList duckNumberListInst = new DuckNumberList();

    public Set<Integer> getDuckNumbers(){
        return duckNumberList.keySet();
    }


    public int getSize(){
        return duckNumberList.size();
    }

    public static DuckNumberList getInstance() {
        return duckNumberListInst;
    }

    public void addNumber(int number, Duck duck){
        duckNumberList.put(number, duck);
    }

    public void removeOneNumber(int number){
        duckNumberList.remove(number);
    }

    public void removeFromList(int duckNumber){
        duckNumberList.remove(duckNumber);
    }
    public void removeAllNumbers(){
        duckNumberList.clear();
    }
}
