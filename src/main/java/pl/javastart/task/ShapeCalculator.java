package pl.javastart.task;

public class ShapeCalculator {
    public Square square;
    public Circle circle;
    public Rectangle rectangle;
    public Triangle triangle;

    public double calculateSquareArea(Square square) {
        this.square = square;
        return Math.pow(square.length, 2);
    }

    public double calculateCircleArea(Circle circle) {
        this.circle = circle;
        return Math.PI * Math.pow(circle.radius, 2);
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        this.triangle = triangle;
        return 3 * triangle.length;
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        this.rectangle = rectangle;
        return 2 * rectangle.width + 2 * rectangle.length;
    }
}
