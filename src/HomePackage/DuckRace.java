package HomePackage;

import java.util.ArrayList;

public class DuckRace {

    static DuckNumberList duckNumberList = DuckNumberList.getInstance();
    static ArrayList<KimberlyQueue> queueList = new ArrayList<KimberlyQueue>();

    private static DuckRace duckRace = new DuckRace();

    public DuckRace() {
        for(int j = 0; j < 10; j++) {
            queueList.add(j, new KimberlyQueue());
            KimberlyQueue queue = queueList.get(j);
            for (int i = 0; i < 10; i++) {
                queue.addToQueue();
            }
        }
        System.out.println(duckNumberList.getDuckNumbers());
    }

    public static DuckRace getInstance() {
        return duckRace;
    }
}
