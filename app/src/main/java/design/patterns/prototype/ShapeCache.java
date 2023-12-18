package design.patterns.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding two shapes

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put("1", circle);

        Rectangle rectangle = new Rectangle();
        shapeMap.put("2", rectangle);
    }
}
