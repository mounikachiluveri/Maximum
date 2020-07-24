public class MaximumNumber {
    public static Integer testMaximun(Integer X, Integer Y, Integer Z) {
        Integer max = X;
        if (Y.compareTo(max) > 0) {
            max = Y;
        }
        if (Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }
}