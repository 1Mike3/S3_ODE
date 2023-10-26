package E7_Threads.src.test.java.at.uastw;

import E7_Threads.src.main.java.at.uastw.Main;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testMain() {
        long beforeMain = System.currentTimeMillis();
        Main.main(new String[] {});
        long afterMain = System.currentTimeMillis();

        long duration = afterMain - beforeMain;
        assertFalse(duration > 10000, "Main method took too long to execute, did you start the tasks in separate threads?");
        assertFalse(duration < 8000, "Main method took too short to execute, did you wait for the results of the tasks?");
    }
}