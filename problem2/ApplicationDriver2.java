package ca.ciccc.wmad202.assignment8.problem2;

public class ApplicationDriver2 {

        enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }
    public static void test() {
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
        //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return 2 * (s1Sides[0] + s1Sides[1]);
            }

            @Override
            public float area() {
                return (s1Sides[0] * s1Sides[1]);
            }
        };
        System.out.println("S1's permiter is:" + s1.perimeter());
        System.out.println("S1's area is:" + s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.Square,s2Sides){
            //complete the implementation of the anonymous inner class here
            public float perimeter() {
                return 4 * (s2Sides[0]);
            }

            @Override
            public float area() {
                return 2 * (s2Sides[0]);
            }
        };
        System.out.println("S2's permiter is:" + s2.perimeter());
        System.out.println("S2s area is:" + s2.area());

        int[] s3Sides = {12};
        Shape s3 = new Shape(ShapeType.Circle,s3Sides){
            //complete the implementation of the anonymous inner class here

            double x = Math.PI; //3.14
            public float perimeter() {
                return (float) (2 * (s3Sides[0]) * x);
            }

            @Override
            public float area() {
                return (float)((Math.pow(s3Sides[0],2)) * x);
            }
        };
        System.out.println("S3's permiter is:" + s3.perimeter());
        System.out.println("S3s area is:" + s3.area());

        int[] s4Sides = {8,12,12};
        Shape s4 = new Shape(ShapeType.Triangle,s4Sides){
            //complete the implementation of the anonymous inner class here

            @Override
            public float perimeter() {
                return  (float) (s4Sides[0] + s4Sides[1] + s4Sides[2]);
            }

            @Override
            public float area() {
                return   (float) (s4Sides[0] * s4Sides[1]  / 2);
            }
        };
        System.out.println("S4's permiter is:" + s4.perimeter());
        System.out.println("S4s area is:" + s4.area());
    }
}
