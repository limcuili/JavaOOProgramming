// Testing ther Interval.java API

public class IntervalTest {

    public static void main(String[] args) {
        Interval a = new Interval(-15.0, 18.0);
        System.out.println("interval a = " + a); // expect "interval a = [-15.0, 18.0]"

        Interval b = new Interval (-14.1, 18.9);
        System.out.println("interval b = " + b); // expect "interval b = [-15.0, 18.0]"

        // expect "True, True, True, False, False"
        boolean c = a.contains(-15.0);
        System.out.print(c + ", ");
        boolean c = a.contains(18.0);
        System.out.print(c + ", ");
        boolean c = a.contains(10.0);
        System.out.print(c + ", ");
        boolean c = a.contains(-100.0);
        System.out.print(c + ", ");
        boolean c = a.contains(100.0);
        System.out.print(c);

        double d = a.length();
        System.out.println("length of interval a = " + d); // expect 33.0

        Interval e = new Interval (19.0, 99.0);
        System.out.println("interval e = " + e); // expect "interval e = [19.0, 99.0]"

        double f = e.length();
        System.out.println("length of interval e = " + f); // 80

        boolean g = a.intersects(b);
        System.out.println("interval a and b intersects = " + g); // expect True

        boolean h = e.intersect(a);
        System.out.println("interval a and e intersects = " + h); // expect False
    }

}