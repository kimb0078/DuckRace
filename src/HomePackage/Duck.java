package HomePackage;
import HomePackage.Generator;

public class Duck {

    DuckNumberList duckNumberList = DuckNumberList.getInstance();
    Generator generator = Generator.getInstance();

    private int duckNumber;

    public Duck() {
        this.duckNumber = generator.generate();
        duckNumberList.addNumber(duckNumber);
    }

    public int getDuckNumber() {
        return duckNumber;
    }
}
