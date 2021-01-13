package ru.ssau.tk.lizadlgv.practice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class NamedPointTest {
    NamedPoint unnamedPoint = new NamedPoint(3., 4., 5.);
    NamedPoint namedPoint = new NamedPoint(3., 4., 7., "First");
    NamedPoint origin = new NamedPoint();

    @Test
    public void testGetName() {
        assertNull(unnamedPoint.getName());
        assertEquals(namedPoint.getName(), "First");
        assertEquals(origin.getName(), "Origin");
    }

    @Test
    public void testSetName() {
        unnamedPoint.setName("Second");
        namedPoint.setName("Third");
        origin.setName("First");
        assertEquals(unnamedPoint.getName(), "Second");
        assertEquals(namedPoint.getName(), "Third");
        assertEquals(origin.getName(), "First");
    }
}