package pl.javastart.task;

public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateRectPerimeter() {
        return 2 * width + 2 * length;
    }
}
