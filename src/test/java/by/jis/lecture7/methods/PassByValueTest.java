package by.jis.lecture7.methods;

import org.junit.Before;
import org.junit.Test;

public class PassByValueTest {

    PassByValue passByValue;

    @Before
    public void setUp() {
        passByValue = new PassByValue();
    }

    @Test
    public void run() {
        passByValue.run();
    }
    @Test
    public void refferenceRun() {
        passByValue.referenceRun();
    }
}
