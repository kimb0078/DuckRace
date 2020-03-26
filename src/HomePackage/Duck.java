package HomePackage;

public class Duck {


    Generator generator = Generator.getInstance();

    private int duckNumber;

    public Duck() {
        this.duckNumber = generator.generate();
    }

    public int getDuckNumber() {
        return duckNumber;
    }
}
