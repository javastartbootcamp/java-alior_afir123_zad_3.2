package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(5);
        double square1Area = square1.calculateSquareArea();
        System.out.println("Pole kwadratu to: " + square1Area);

        Rectangle rectangle1 = new Rectangle(5, 3);
        double rectangle1Perimeter = rectangle1.calculateRectPerimeter();
        System.out.println("Obwód prostokąta to: " + rectangle1Perimeter);

        Circle circle1 = new Circle(5);
        double circle1Area = circle1.calculateCircleArea();
        System.out.println("Pole koła to: " + circle1Area);

        Triangle triangle1 = new Triangle(4);
        double triangle1Perimeter = triangle1.calculateTrianglePerimeter();
        System.out.println("Obwód trójkąta to: " + triangle1Perimeter);

    }
}
