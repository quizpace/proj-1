public class PrimitiveVariables {
    public static void main(String[] args) {
        int intValue = 23;
        System.out.println("int: " + intValue);
        double doubleValue = 5.87896;
        System.out.println("double: " + doubleValue);
        char charValue = 'V';
        System.out.println("char: " + charValue);
        boolean booleanValue = true;
        System.out.println("boolean: " + booleanValue);
        long longValue = 1234567890L;
        System.out.println("long: " + longValue);

// Narrowing Type Casting:
        int intNarrow = (int) doubleValue;
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intNarrow);

        // Widening Type Casting:
        double doubleWidening = intValue;
        System.out.println("Original int value: " + intValue);
        System.out.println("Widened double value: " + doubleWidening);

        // Illegal type casting (int to boolean)
//        boolean Illegalboolean = (boolean) intValue;
//        System.out.println("Illegalboolean: " + Illegalboolean);

    }


}

