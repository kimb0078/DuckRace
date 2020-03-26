package HomePackage;

import java.util.concurrent.atomic.AtomicInteger;

//Fundet på https://stackoverflow.com/questions/20384127/creating-an-incremental-number-sequence-in-java
public class Generator {

    //Denne klasse bruger AtomicInteger for at sikre sig, at hvert tal, som bliver genereret, er unikt
    //counter starter fra 1, så den første and vil have duckNumber = 1
    private AtomicInteger count = new AtomicInteger(1);

    //generator er en singleton, da der kun skal bruges en instans af den
    private static Generator generator = new Generator();

    private Generator() { }

    //sender instansen af Generator til Duck-klassen
    public static Generator getInstance() {
        return generator;
    }

    //getter til count, som bruger AtomicInteger's indbygget metode getAndIncrement
    //giver nye ænder et nyt unikt nummer, som er 1 større end det sidste nummer, som blev genereret
    public int generate() {
        return count.getAndIncrement();
    }
}
