package by.jis.lecture7;

public class App {
    int a, b;


    public static void main(String... args) {
    }

    void save() {

    }

    void save(App application) {

    }

    void save(int a, final int b) {
        if (b < a) {
            return;
        }
        System.out.println("b>a = " + (b > a));
        return;
    }

}
