package HomePackage;

import java.util.ArrayList;
import java.util.HashSet;

public class DuckNumberList {

    private HashSet<Integer> duckNumberList = new HashSet<>();

    private static DuckNumberList duckNumberListInst = new DuckNumberList();

    public HashSet<Integer> getDuckNumbers(){
        return duckNumberList;
    }

    public int getSize(){
        return duckNumberList.size();
    }

    public static DuckNumberList getInstance() {
        return duckNumberListInst;
    }

    public void addNumber(int number){
        duckNumberList.add(number);
    }

    public void removeOneNumber(int number){
        duckNumberList.remove(number);
    }

    public void removeAllNumbers(){
        duckNumberList.clear();
    }
}
