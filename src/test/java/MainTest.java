import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void differenceTrue() {
        int a = 23;
        int b = 56;
        int c = Main.difference(a, b);
        assertEquals(-33, c);
    }
    @Test
    public void differenceFalse() {
        int a = 23;
        int b = 56;
        int c = Main.difference(a, b);
        assertEquals(33, c);
    }
}