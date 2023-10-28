package pl.javastart.task;

public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {

        return Math.PI * Math.pow(radius, 2);
    }
}
