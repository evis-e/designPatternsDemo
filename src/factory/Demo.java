package factory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        shapeFactory.getShape("CIRCLE").draw();

        //get an object of Rectangle and call its draw method.
        shapeFactory.getShape("RECTANGLE").draw();

        //get an object of Triangle and call its draw method.
        shapeFactory.getShape("TRIANGLE").draw();
    }
}