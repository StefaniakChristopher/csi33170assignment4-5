import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class AverageTest {

    private Average avg;

    @Before
    public void setUp() {
        avg = new Average();
    }

    @Test
    public void testPath1() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(-1.0, avg.average(0, nums), 0.0);
    }

    // path 2 cannot be tested since if we can't get into the while loop, we cannot
    // increment the count past 0

    @Test
    public void testPath3onePass() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(1.0, avg.average(1, nums), 0.0);
    }

    @Test
    public void testPath3fivePasses() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(3.0, avg.average(5, nums), 0.0);
    }

    @Test
    public void testPath3ninePasses() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(5, avg.average(9, nums), 0.0);
    }

    @Test
    public void testPath3tenPasses() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(5.5, avg.average(10, nums), 0.0);
    }

    @Test
    public void testPath3elevenPasses() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(6.0, avg.average(11, nums), 0.0);
    }

    @After
    public void tearDown() {
        avg = null;
    }
}
