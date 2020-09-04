package by.jis.lecture7.encapsulation.modifiers.pack;

import by.jis.lecture7.encapsulation.modifiers.rootpack.MyClass;

public class MyClassChildInOtherPack extends MyClass{

    public void run() {
        var i = this.protectedPass;
//        var k = this.defaultLogin;  // not accessible
//        var j = this.privateName;   // not accessible
    }

}
