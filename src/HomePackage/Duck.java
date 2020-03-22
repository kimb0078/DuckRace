package HomePackage;
import HomePackage.Generator;

import java.util.Random;

public class Duck {

    DuckNumberList duckNumberList = DuckNumberList.getInstance();
    Generator generator = Generator.getInstance();

    private int duckNumber;

    public Duck() {

        Boolean isNumberSet = false;

        while (isNumberSet == false) {
            int temp = generator.generate();

            if (!duckNumberList.getDuckNumbers().contains(temp)) {
                this.duckNumber = temp;
                duckNumberList.addNumber(duckNumber, this);
                isNumberSet = true;
            }
        }
    }

    public int getDuckNumber() {
        return duckNumber;
    }

    public void removeDuck(int duckNumber){
        duckNumberList.removeFromList(duckNumber);
    }

    //Denne metode blev fundet på https://mkyong.com/java/java-generate-random-integers-in-a-range/
    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
