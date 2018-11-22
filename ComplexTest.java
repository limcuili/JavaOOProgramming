public class ComplexTest {

    // sample client for testing
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        System.out.println("a = " + a);

        Complex b = new Complex(-2.0, 3.0);
        System.out.println("b = " + b);

        Complex c = b.times(a);
        System.out.println("c = " + c);
    }

}