public class ShapeFactory {
    public Shape getShape(String shape) {
        if ("cirle".equals(shape)) {
            return new Circle();
        } else if ("rectangle".equals(shape)) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
