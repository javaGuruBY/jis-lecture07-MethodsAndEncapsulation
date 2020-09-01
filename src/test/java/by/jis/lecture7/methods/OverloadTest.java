package by.jis.lecture7.methods;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OverloadTest {

    Overload overload;

    @Before
    public void setUp() {
        this.overload = new Overload();
    }

    @Test
    public void myMethodWithMoreSpecificReference() {
        overload.myMethod("Hello");
        overload.myMethod('c');
    }
    @Test
    public void myMethodWithMoreSpecificPrimitive() {
        int b = 3;
        overload.myMethod(b);
    }
    @Test
    public void myMethodWithMoreSpecificWrappers() {
        byte b = 3;
        overload.myMethod(b);
    }
    @Test
    public void myMethodWithMoreSpecificVarargs() {
        byte b = 3;
        overload.myMethod(b);
    }
    @Test
    public void myMethodWithMoreSpecificVarargs2() {
        overload.myMethod(3);
    }
}
//        double > float > long > int > char
                        //        int > short > byte
