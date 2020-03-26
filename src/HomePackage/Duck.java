package HomePackage;

import org.junit.jupiter.params.converter.ArgumentConverter;

public class Duck{

    //Da generator er en singleton, henter jeg generator instansen her
    Generator generator = Generator.getInstance();

    private int duckNumber;

    //Hvis Duck bliver instansieret uden et angivet nummer, genererer generator et duckNumber
    public Duck() {
        this.duckNumber = generator.generate();
    }

    //Denne constructor bliver kun brugt thil at teste addSpecificDuckToQueue(Duck duck) i KimberlyQueueTest-klassen
    public Duck(int duckNumber){
        this.duckNumber = duckNumber;
    }

    public int getDuckNumber() {
        return duckNumber;
    }
}
