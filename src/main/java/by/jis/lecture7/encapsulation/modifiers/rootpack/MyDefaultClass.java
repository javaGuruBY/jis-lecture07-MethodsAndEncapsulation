package by.jis.lecture7.encapsulation.modifiers.rootpack;

class MyDefaultClass {

    private String privateName;    //private
    String defaultLogin;           //default

    class MyPrivateService {

        void run() {
            var myClass = new MyDefaultClass();
            myClass.privateName = "max";
        }
    }

    void run() {
        this.privateName = "max";
    }

}
