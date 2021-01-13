package ru.ssau.tk.lizadlgv.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.lizadlgv.practice.person.Person;

import static ru.ssau.tk.lizadlgv.practice.GetNameOfClassOrPrimitive.printType;

public class GetNameOfClassOrPrimitiveTest {
    @Test
    public void testPrintType() {
        printType((byte) 255);
        printType('z');
        printType((short) 65535);
        printType(125);
        printType(125L);
        printType(0.1f);
        printType(0.1d);
        printType(false);
        printType(new Person());
        printType(new Integer(1));
        printType("");
        printType(null);
    }
}