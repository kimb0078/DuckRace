package HomePackage;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test //Det her blev skrevet i klassen Main uden at teste først
    //Jeg kan hellere ikke få lov til at skrive f.eks assertTrue i metoden, for at teste det nu
    void main(){
        DuckRace duckRace = DuckRace.getInstance();

        System.out.println("Ducks at Start");
        duckRace.printDucks();

        for(int i = 1; i < 10; i++){
            System.out.println("Round " + i);
            duckRace.nextRound(10-i);
            duckRace.printDucks();
        }

        System.out.println("We have a winner!");
    }
}