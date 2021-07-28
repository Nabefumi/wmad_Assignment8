package ca.ciccc.wmad202.assignment8.problem3;

abstract class Shape3 {

    public abstract float perimeter();
    public abstract float area();

    ApplicationDriver3.ShapeType type;

    public Shape3(ApplicationDriver3.ShapeType st, int[] s1Sides) {
        this.type = st;
    }

}
