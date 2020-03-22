package HomePackage;

import java.util.Random;

public class Duck {


    Generator generator = Generator.getInstance();

    private int duckNumber;

    public Duck() {
        this.duckNumber = generator.generate();
    }

    public int getDuckNumber() {
        return duckNumber;
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
