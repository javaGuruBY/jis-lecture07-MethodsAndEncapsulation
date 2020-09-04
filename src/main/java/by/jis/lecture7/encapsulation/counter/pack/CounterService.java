package by.jis.lecture7.encapsulation.counter.pack;

import by.jis.lecture7.encapsulation.counter.rootPack.Counter;
import by.jis.lecture7.encapsulation.counter.rootPack.CounterProvider;
import by.jis.lecture7.encapsulation.counter.rootPack.CounterStaticProvider;
//import by.jis.lecture7.encapsulation.counter.rootPack.DefaultAccessCounter; // not accessible

public class CounterService {

    public void run() {
//        Counter counter = new Counter(); // not accessible
        CounterProvider counterProvider = new CounterProvider();
        Counter myCounter = counterProvider.getCounter();
        Counter my2Counter = CounterStaticProvider.getCounter();

//        DefaultAccessCounter my3Counter = counterProvider.getDefaultAccessCounter(); // not accessible
//        DefaultAccessCounter my4Counter = CounterStaticProvider.getDefaultAccessCounter(); // not accessible
    }
}
