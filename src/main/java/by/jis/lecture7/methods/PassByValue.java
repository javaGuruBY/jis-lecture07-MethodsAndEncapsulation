package by.jis.lecture7.methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassByValue {
    class Data {
        int value = 100;
    }

    private Logger log = LoggerFactory.getLogger(PassByValue.class);

    public void run() {
        Data a = new Data();
        log.info("Data a: " + a);
        doubleIt(a);
        log.info("Data a: " + a);
        log.info("data.value: " + a.value + " a: " + a);
    }

    public void doubleIt(Data x) {
        log.info("1 Data x: " + x);
        x = new Data();
        log.info("2 Data x: " + x);
        x.value = 2 * x.value;
    }

    public void referenceRun() {
        Data a = new Data();
        Data b = a;

        b = doubleDataValue(b);

        log.info("Data a: " + a.value);
        log.info("Data b: " + b.value);

        log.info("Data a: " + a);
        log.info("Data b: " + b);

    }
    public Data doubleDataValue(final Data x) {
        var c = new Data();
        c.value = 2 * x.value;
        return x;
    }

}
