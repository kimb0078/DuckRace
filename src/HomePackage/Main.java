package HomePackage;

public class Main {

    public static void main(String[] args){

        try {
            //Instansen af DuckRace bliver hentet
            DuckRace duckRace = DuckRace.getInstance();
            System.out.println("Ducks at Start");
            //Alle ændernes numre fra duckRace oprettelsen printes ud
            duckRace.printDucks();

            //Der bliver spillet 9 runder, med (n-1)*(n-1) for hver runde
            for(int i = 1; i < 10; i++){
                System.out.println("Round " + i);
                duckRace.nextRound(10-i);
                duckRace.printDucks();
            }

            System.out.println("We have a winner!");

        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
