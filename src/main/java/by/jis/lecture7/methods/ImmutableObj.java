package by.jis.lecture7.methods;

public class ImmutableObj {

    final private String name;
    final private String surname;

    public ImmutableObj(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ImmutableObj changeName(String name, String surname, ImmutableObj immutableObj) {
        return new ImmutableObj(name, surname);
    }
}
