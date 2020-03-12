package HomePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Queue queue = new Queue();
        assertNotNull(queue);

        for (int i = 0; i < 25; i++) {
            queue.addToQueue();
        }

        assertEquals(25, queue.getNumberOfDucks());

        queue.removeFromQueue();

        assertEquals(24,queue.getNumberOfDucks());
    }
}