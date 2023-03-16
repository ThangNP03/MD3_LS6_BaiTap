package Point2dAnd3d;

public class Main {
    public static void main(String[] args) {
        printTestRange("POINT2D");
        Point2d pnt = new Point2d();
        System.out.println(pnt);
        Point2d pnt1 = new Point2d(10, 20);
        System.out.println(pnt1);
        printTestRange("POINT3D");
        Point3d pnt2 = new Point3d();
        System.out.println(pnt2);
        Point3d pnt3 = new Point3d(10,20,30);
        System.out.println(pnt3);


    }
    public static void printTestRange(String value){
        System.out.println();
        System.out.println("------------- " + value + " -------------");
        System.out.println();
    }
}
