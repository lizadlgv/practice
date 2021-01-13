package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static ru.ssau.tk.lizadlgv.practice.exceptiontasks.CastingStringToInt.divisionStr;

public class CastingStringToIntTest {
    @Test
    public void testDivisionStr() {
        assertEquals(divisionStr("2", "1"), 2, 0.001);
        assertEquals(divisionStr("6", "2"), 3, 0.001);
        Assert.assertThrows(NumberFormatException.class, () -> divisionStr("K", "2"));
        Assert.assertThrows(NullPointerException.class, () -> divisionStr(null, "2"));
        Assert.assertThrows(ArithmeticException.class, () -> divisionStr("1", "0"));
        Assert.assertThrows(NumberFormatException.class, () -> divisionStr("2", "l"));
        Assert.assertThrows(NumberFormatException.class, () -> divisionStr("2", "l"));
    }
}