public class MaximumNumber<E extends Comparable> {
    E X;
    E Y;
    E Z;

    public MaximumNumber(E X, E Y, E Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
    /* public static Integer testMaximum(Integer X, Integer Y, Integer Z) {
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

    public static String testMaximum(String X, String Y, String Z) {
        String max = X;
        if (Y.compareTo(max) > 0) {
            max = Y;
        }
        if (Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }*/

    public static <E extends Comparable<E>> E testMaximum(E X, E Y, E Z) {
        E max = X;
        if (Y.compareTo(max) > 0) {
            max = Y;
        }
        if (Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }

    public <E extends Comparable<E>> E testMaximum() {
        E max = (E) testMaximum(X, Y, Z);
        return max;
    }

}





