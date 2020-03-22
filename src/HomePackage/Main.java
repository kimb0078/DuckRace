package HomePackage;

public class Main {

    public static void main(String[] args){

        try {
            DuckRace duckRace = DuckRace.getInstance();
            System.out.println("Ducks at Start");
            duckRace.printDucks();

            for(int i = 1; i < 10; i++){
                System.out.println("Round " + i);
                duckRace.nextRound(10-i);
                duckRace.printDucks();
            }

            /*System.out.println("Ducks after round 1");
            duckRace.nextRound(9);
            duckRace.printDucks();

            System.out.println("Round 2");
            duckRace.nextRound(8);
            duckRace.printDucks();
            */

        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
