package by.jis.lecture7.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VarargsTest {

    Varargs varargs;

    @Before
    public void setUp() {
        this.varargs = new Varargs();
    }

    @Test
    public void averageWithArrayShouldReturnZero() {
        int[] valuesNull = null;
        int[] valuesEmpty = new int[0];

        double actual = varargs.averageWithArray(valuesNull);
        assertEquals(0, actual, 0);

        actual = varargs.averageWithArray(valuesEmpty);
        assertEquals(0, actual, 0);
    }

    @Test
    public void averageWithArrayShouldReturnAverage() {
        int[] values = {1, 2, 3, 4,};

        double actual = varargs.averageWithArray(values);
        assertEquals(2.5, actual, 0);
    }

    @Test
    public void differentVarargs() {
        varargs.averageWithVarargs();
        varargs.averageWithVarargs(2);
        varargs.averageWithVarargs(1,2,3,4);
        varargs.averageWithVarargs(null);
        varargs.averageWithVarargsWithLeadingInt(1, 2, 3);
    }
}
