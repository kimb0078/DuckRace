package HomePackage;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class DuckNumberListTest {

    private HashSet<Integer> duckNumbers = new HashSet<>();

    @Test
    HashSet<Integer> getDuckNumbers(){
        return duckNumbers;
    }

    @Test
    int getSize(){

        duckNumbers.add(0);
        return duckNumbers.size();
    }

    @Test
    public void addNumber(int number){
        duckNumbers.add(number);
    }
}