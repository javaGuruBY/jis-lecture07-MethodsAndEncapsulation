package by.jis.lecture7.encapsulation.counter.rootPack;

public class CounterStaticProvider {

    static public Counter getCounter() {
        return new Counter();
    }

    static public DefaultAccessCounter getDefaultAccessCounter() {
        return new DefaultAccessCounter();
    }
}
