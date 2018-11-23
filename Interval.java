public class Interval {
    private double left, right; // instance variables

    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public boolean contains(double x) { return (left <= x && x <= right); }

}