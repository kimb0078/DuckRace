package HomePackage;

import java.util.concurrent.atomic.AtomicInteger;

//Fundet på https://stackoverflow.com/questions/20384127/creating-an-incremental-number-sequence-in-java
public class Generator {

    private AtomicInteger count = new AtomicInteger(1);

    private static Generator generator = new Generator();

    private Generator() { }

    public static Generator getInstance() {
        return generator;
    }

    public int generate() {
        return count.getAndIncrement();
    }
}
