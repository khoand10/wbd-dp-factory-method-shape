public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factoryPatternDemo = new ShapeFactory();
        Shape shape1 = factoryPatternDemo.getShape("circle");
        Shape shape2 = factoryPatternDemo.getShape("rectangle");
    }
}
