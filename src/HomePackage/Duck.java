package HomePackage;

public class Duck {

    Generator generator;
    DuckNumberList duckNumberList;

    private int duckNumber;

    public Duck(int duckNumber) {
        this.duckNumber = duckNumber;
        //duckNumberList.addNumber(duckNumber);
    }

    public void setDuckNumber(){
        duckNumber = generator.generate();
        duckNumberList.addNumber(duckNumber);
    }


    public int getDuckNumber() {
        return duckNumber;
    }
}
