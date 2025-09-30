package msu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result, "2 + 3 should be 5");
    }

    @Test
    void testMultiplication() {
        App app = new App();
        int result = app.multiply(4, 5);
        assertEquals(20, result, "4 * 5 should be 20");
    }
}
