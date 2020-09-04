package by.jis.lecture7.encapsulation.modifiers.rootpack;

public class MyClassChild extends MyClass{

    public void run() {
        var i = this.protectedPass;
        var k = this.defaultLogin;
//        var j = this.privateName; // not accessible
    }

}
