public class MaximumNumber {
    public static Integer testMaximum(Integer X, Integer Y, Integer Z) {
        Integer max = X;
        if (Y.compareTo(max) > 0) {
            max = Y;
        }
        if (Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }
    public static Float testMaximum(Float X, Float Y, Float Z) {
        Float max = X;
        if (Y.compareTo(max) > 0) {
            max = Y;
        }
        if (Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }
}




