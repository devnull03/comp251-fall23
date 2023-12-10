
public class equals {
    static String str1 = "Hello";
    static String str2 = "Hello";
    static String str3 = new String("Hello");

    static boolean x = (str1 == str2);
    static boolean y = (str1 == str3);
    static boolean z = str1.equals(str3);

    public static void main(String[] args) {
        System.out.println(str1 == str2);
        System.out.println(y);
        System.out.println(z);
    }
}

// x is true because of java's " string interning " process where two different strings
// with same value are optimized and stored in same memory location otherwise its false
// because "==" compares memory location not the value, that is why y is false.
// on the other hand "equals()" compares values it does not have something to do with
// memory location
