package by.jis.lecture7.methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Overload {

    private Logger log = LoggerFactory.getLogger(Overload.class);

    public void myMethod(Object obj) {
        log.info("myMethod(Object obj)");
    }

    public String myMethod(CharSequence v) {
        log.info("myMethod(CharSequence v)");
        return "hello";
    }

    public void myMethod(long v) {
        log.info("myMethod(long v)");
    }

    public void myMethod(short v) {
        log.info("myMethod(short v)");
    }

    public void myMethod(Byte v) {
        log.info("myMethod(Byte v)");
    }

    public void myMethod(int... v) {
        log.info("myMethod(int... v)");
    }

    public void myMethod(Integer v) {
        log.info("myMethod(Integer v)");
    }

    public void myMethod(long... v) {
        log.info("myMethod(long... v)");
    }

    public void myMethod(Long v) {
        log.info("myMethod(Long v)");
    }
}
