package gr.aueb.cf.cf9.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D(2, 5.5);
        Point p3 = new Point3D(2, 5.5, 10);

        p1.movePlusOne();
        p2.movePlus10();
        p3.movePlusOne();

        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void doMovePlus10(Point p) {
        p.movePlus10();         // late binding
    }
}
