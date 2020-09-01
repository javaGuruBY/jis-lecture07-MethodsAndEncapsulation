package by.jis.lecture7.methods;

public class ImmutableService {

    public ImmutableObj changeName(String name, String surname, ImmutableObj immutableObj) {
        return new ImmutableObj(name, surname);
    }

    public String concat(String left, String right, int i) {
        StringBuffer result = new StringBuffer();
        for (int k = 0; k<=i; k++) {
            result.append(left);
            result.append(right);
        }
        return result.toString();
    }
}
