package by.jis.lecture7.encapsulation.counter.rootPack;

public class CounterProvider {

    public Counter getCounter() {
        return new Counter();
    }

    public DefaultAccessCounter getDefaultAccessCounter() {
        return new DefaultAccessCounter();
    }
}
