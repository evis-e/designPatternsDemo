package factory;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){

        if(shapeType == null) return null;
        if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        if(shapeType.equalsIgnoreCase("TRIANGLE")) return new Triangle();

        return null;
    }
}