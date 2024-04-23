abstract class ShapeAbstract {
    abstract double calculateArea();

    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends ShapeAbstract{
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Additional methods specific to Rectangle
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

class Circle extends ShapeAbstract {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Additional methods specific to Circle
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}