package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(5);
        Rectangle rectangle1 = new Rectangle(5, 3);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(4);

        ShapeCalculator shapeCalculator1 = new ShapeCalculator();

        double square1Area = shapeCalculator1.calculateSquareArea(square1);
        System.out.println("Pole kwadratu to:" + square1Area);

        double circle1Area = shapeCalculator1.calculateCircleArea(circle1);
        System.out.println("Pole koła to: " + circle1Area);

        double triangle1Perimeter = shapeCalculator1.calculateTrianglePerimeter(triangle1);
        System.out.println("Obwód trójkąta to: " + triangle1Perimeter);

        double rectangle1Perimeter = shapeCalculator1.calculateRectPerimeter(rectangle1);
        System.out.println("Obwód prostokąta to: " + rectangle1Perimeter);
    }
}
