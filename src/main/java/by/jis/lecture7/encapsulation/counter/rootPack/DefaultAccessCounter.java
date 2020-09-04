package by.jis.lecture7.encapsulation.counter.rootPack;

class DefaultAccessCounter {

    private int value;

    DefaultAccessCounter() {
    }

    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public void clear() {
        value = 0;
    }
    public void setValue(int newValue) {
        if(isPositive(newValue)) {
            value = newValue;
        } //should be positive
    }

    private boolean isPositive(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

}
