package HomePackage;

public class Main {
    public static void main(String[] args) throws NullPointerException{
        try {
            Queue queue = new Queue();

            System.out.println("Adding 25 ducks to the queue");
            for (int i = 0; i < 25; i++) {
                queue.addToQueue();
            }

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");

            queue.removeFromQueue();
            System.out.println("The first duck has reached the finish line!");

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");
        }
        catch (NullPointerException nullPEx){
            System.out.println("Cannot find queue.");
        }

    }
}
