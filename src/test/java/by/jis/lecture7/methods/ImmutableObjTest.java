package by.jis.lecture7.methods;

import org.junit.Before;
import org.junit.Test;

public class ImmutableObjTest {

    ImmutableService immutableService;

    @Before
    public void setup() {
        immutableService = new ImmutableService();
    }

    @Test
    public void simpleTest() {
        var immutable = new ImmutableObj("Maxim", "Shelkovich");
        immutable = immutableService.changeName("Egor", "Barilo", immutable);
    }

    @Test
    public void simpleTest2() {
        String a = "vasi";
        String s = "vasi";
    }
}
