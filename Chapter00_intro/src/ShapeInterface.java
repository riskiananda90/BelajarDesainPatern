interface ShapeInterface {
    // Method for calculating area (implicitly public and abstract)
    double calculateArea();

    // Method for drawing shapes (implicitly public and abstract)
    void draw();

}

class PersegiPanjang implements ShapeInterface{
    private double length;
    private double width;

    public PersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    public double calculateArea() {
        return length * width;
    }

    // Implementation of draw for Rectangle
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    // Additional methods specific to Rectangle
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

class Bulat implements ShapeInterface {
    private double radius;

    public Bulat(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of draw for Circle
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // Additional methods specific to Circle
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}