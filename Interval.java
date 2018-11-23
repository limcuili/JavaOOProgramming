public class Interval {
    private double left, right; // instance variables

    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public String toString() { return ("[" + left + ", " + right + "]"); }

    public boolean contains(double x) { return (left <= x && x <= right); }

    public double length() { return 0.0; }

    public boolean intersects(Interval b) { return true; }
}