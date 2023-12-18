package design.patterns.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @BeforeAll
    public static void setUpClass() {
        ShapeCache.loadCache();
    }

    @Test
    public void testPrototypePattern() {
        Shape clonedShape1 = ShapeCache.getShape("1");
        assertEquals("Circle", clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        assertEquals("Rectangle", clonedShape2.getType());

        // Verify that cloned shapes are different objects
        assertNotSame(clonedShape1, ShapeCache.getShape("1"));
        assertNotSame(clonedShape2, ShapeCache.getShape("2"));
    }
}
