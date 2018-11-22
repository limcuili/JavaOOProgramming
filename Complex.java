// Note that this is pretty much an API and therefore we don't need a main method.

public class Complex {
    private final double re, im; //instance variables

    public Complex(double real, double imag) {
        re = real; im = imag;
    }

    public double re() { return re; }
    public double im() { return im; }

    public String toString() { return re() + " + " + im() + "i"; }

    public Complex plus(Complex b) {
        double real = re + b.re;
        double imag = im + b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b) {
        double real = (re * b.re) - (im * b.im);
        double imag = (re * b.im) + (im * b.re);
        return new Complex(real, imag);
    }

    public double abs() { return Math.sqrt(re*re + im*im); }

}