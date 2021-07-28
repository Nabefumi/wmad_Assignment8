package ca.ciccc.wmad202.assignment8.problem3;

public class ApplicationDriver3 {

    static class MyGeometry {

        public void calculateAreaAndPerimeter(Shape3 shape3) {
            if(!Custom.class.isInstance(shape3)) {
                System.out.println("==========");
                System.out.println(shape3.type + " perimeter is: " + shape3.perimeter());
                System.out.println(shape3.type +  " area is: " + shape3.area());
            } else {
                shape3.perimeter();
            }
        }
    }
//    public class Custom {
//    }
    enum ShapeType {
        Rectangle,
        Triangle,
        Square,
        Circle,
        Custom
    }



    public static void test() {
        MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10, 20};
        ShapeType s1Type = ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape3(s1Type, s1Sides) {
            //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return 2 * (s1Sides[0] + s1Sides[1]);
            }

            @Override
            public float area() {
                return (s1Sides[0] * s1Sides[1]);
            }
        });

        int[] s2Sides = {10};
        ShapeType s2Type = ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape3(s2Type, s2Sides) {
            //complete the implementation of the anonymous inner class here
            public float perimeter() {
                return 4 * (s2Sides[0]);
            }

            @Override
            public float area() {
                return 2 * (s2Sides[0]);
            }
        });

        int[] s3Sides = {12};
        ShapeType s3Type = ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape3(s3Type, s3Sides) {
            //complete the implementation of the anonymous inner class here

            double x = Math.PI; //3.14
            public float perimeter() {
                return (float) (2 * (s3Sides[0]) * x);
            }

            @Override
            public float area() {
                return (float)((Math.pow(s3Sides[0],2)) * x);
            }
        });

        int[] s4Sides = {8,12,12};
        ShapeType s4Type = ShapeType.Triangle;
        mg.calculateAreaAndPerimeter(new Shape3(s4Type, s4Sides) {
            //complete the implementation of the anonymous inner class here

            @Override
            public float perimeter() {
                return (float) (s4Sides[0] + s4Sides[1] + s4Sides[2]);
            }

            @Override
            public float area() {
                return (float) (s4Sides[0] * s4Sides[1]  / 2);
            }
        });

//        int[] s5ides = {0};
//        ShapeType sType = ShapeType.Custom;
//        mg.calculateAreaAndPerimeter(new Shape3(sType, s5ides) {
//
//            @Override
//            public float perimeter() {
//                return 0;
//            }
//
//            @Override
//            public float area() {
//                return 0;
//            }
//
//        });
    }
}
