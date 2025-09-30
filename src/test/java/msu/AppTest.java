package msu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testGreeting() {
        App app = new App();
        assertTrue(app.greet().contains("Jenkins"), "Greeting should contain Jenkins");
    }
}
