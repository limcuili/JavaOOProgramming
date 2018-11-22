// compile with 'javac ComplexTest.java' and 'javac Complex.java'
// run with 'java ComplexTest'

public class ComplexTest {

    // Test 1
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        System.out.println("a = " + a);

        Complex b = new Complex(-2.0, 3.0);
        System.out.println("b = " + b);

        // expect -28.0 + 3.0i
        Complex c = b.times(a);
        // it expects c to be a string and therefore it goes back to the Complex.java and looks for a toString method.
        System.out.println("The multiplication of a and be is c = " + c);

        // expect sqrt(61) = 7.81
        double d = a.abs();
        System.out.println("The absolute of a is d = " + d);

        //expect sqrt(13) = 3.60555
        double e = b.abs();
        System.out.println("The absolute of b is e = " + e);
    }

}