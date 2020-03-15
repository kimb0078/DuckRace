package HomePackage;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckNumberListTest {

    private HashSet<Integer> duckNumberList = new HashSet<>();

    private static DuckNumberList duckNumberListInst = new DuckNumberList();

    @Test
    HashSet<Integer> getDuckNumbers(){
        return duckNumberList;
    }

    @Test
    int getSize(){
        return duckNumberList.size();
    }

    @Test
    void addNumber(int number){
        duckNumberList.add(number);
    }

    @Test
    void removeOneNumber(int number){
        duckNumberList.remove(number);
    }

    @Test
    void removeAllNumbers(){
        duckNumberList.clear();
        assertEquals(0, duckNumberList.size());
    }
}