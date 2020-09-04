package by.jis.lecture7.encapsulation.modifiers.rootpack;

public class MyClass {

    private String privateName;    //private
    String defaultLogin;           //default
    protected String protectedPass;  //protected

    public class MyPrivateService {

        public void run() {
            var myClass = new MyClass();
            myClass.privateName = "max";
        }
    }

    public void run() {
        this.privateName = "max";
    }
}
