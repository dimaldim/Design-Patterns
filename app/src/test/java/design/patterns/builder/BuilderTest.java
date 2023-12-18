package design.patterns.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testHouseBuilder() {
        House house = new House.HouseBuilder()
                .foundation("Concrete")
                .structure("Wood")
                .roof("Metal")
                .furnished(true)
                .painted(true)
                .build();

        assertEquals("Concrete", house.getFoundation());
        assertEquals("Wood", house.getStructure());
        assertEquals("Metal", house.getRoof());
        assertTrue(house.isFurnished());
        assertTrue(house.isPainted());
    }
}
