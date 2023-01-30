import static org.junit.Assert.*;

public class MainTest2 {

    @org.junit.Test
    public void differenceTrue() {
        int a = 23;
        int b = 56;
        int c = Main.difference(a, b);
        assertEquals(-33, c);
    }
    @org.junit.Test
    public void differenceFalse() {
        int a = 23;
        int b = 56;
        int c = Main.difference(a, b);
        assertEquals(33, c);
    }
}