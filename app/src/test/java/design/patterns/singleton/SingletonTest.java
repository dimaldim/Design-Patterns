package design.patterns.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void testSinglet() {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        assertEquals(instanceOne, instanceTwo);
    }
}
