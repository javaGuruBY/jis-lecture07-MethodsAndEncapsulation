package by.jis.lecture7.encapsulation.modifiers.rootpack;

public class MyClassServise {

    public void run() {
        var myClass = new MyClass();
//        myClass.privateName = "max"; // not accessible
        myClass.defaultLogin = "bax";
        myClass.protectedPass = "asd";
    }
}
