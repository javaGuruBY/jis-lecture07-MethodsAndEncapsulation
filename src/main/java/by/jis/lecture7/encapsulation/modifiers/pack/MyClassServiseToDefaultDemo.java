package by.jis.lecture7.encapsulation.modifiers.pack;

import by.jis.lecture7.encapsulation.modifiers.rootpack.MyClass;
import by.jis.lecture7.encapsulation.modifiers.rootpack.MyClassChild;
//import by.jis.lecture7.encapsulation.modifiers.MyDefaultClass; // not accessible

public class MyClassServiseToDefaultDemo extends MyClass{ //nevertheless it's extends MyClass, protected not accessible

    public void run() {
        var myClass = new MyClass();
//        myClass.privateName = "max";      // not accessible
//        myClass.defaultLogin = "bax";     // not accessible
//        var myDefaultClass = new MyDefaultClass(); // not accessible
//        myClass.protectedPass = "asd";    // not accessible

        var myClassChild = new MyClassChild();
//        myClassChild.protectedPass;     // not accessible
    }
}
