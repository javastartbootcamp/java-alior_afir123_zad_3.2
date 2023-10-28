package pl.javastart.task;

public class Triangle {
    public int length;

    public Triangle(int length) {
        this.length = length;
    }

    public double calculateTrianglePerimeter() {

        return 3 * length;        //dla trójkąta równobocznego.
    }
}
