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

        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
