package by.jis.lecture7.methods;

public class Varargs {


    public double averageWithArray(int[] values) {
        double sum = 0;
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return  values.length == 0 ? 0 :  sum / values.length;
        }
        return 0;
    }

    public double averageWithVarargs(int... values) {
        double sum = 0;
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return  values.length == 0 ? 0 :  sum / values.length;
        }
        return 0;
    }

    public double averageWithVarargsWithLeadingInt(int j, int... values) {
        double sum = 0;
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return  values.length == 0 ? 0 :  sum / values.length;
        }
        return 0;
    }
}
