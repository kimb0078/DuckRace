package HomePackage;

import java.util.ArrayList;

public class Main {

    static DuckNumberList duckNumberList;
    static ArrayList<KimberlyQueue> queueList = new ArrayList<KimberlyQueue>();

    public static void main(String[] args) throws NullPointerException{

        try {


            for(int j = 0; j < 10; j++) {
                queueList.add(j, new KimberlyQueue());
                KimberlyQueue queue = queueList.get(j);
                for (int i = 0; i < 10; i++) {
                    queue.addToQueue(i);
                }
            }
            System.out.println(duckNumberList.getDuckNumbers());

            /*
            ArrayList<KimberlyQueue> queues = new ArrayList<>();

            for(int i = 0; i < 10; i++){
                queues.add(new KimberlyQueue());
            }

            System.out.println(queues);
            KimberlyQueue queue = new KimberlyQueue();

            System.out.println("Adding 25 ducks to the queue");
            for (int i = 0; i < 25; i++) {
                queue.addToQueue();
            }

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");

            queue.removeFromQueue();
            System.out.println("The first duck has reached the finish line!");

            System.out.println("The queue has " + queue.getNumberOfDucks() + " ducks.");

             */
        }
        catch (NullPointerException nullPEx){
            System.out.println("Cannot find queue.");
        }

    }
}
