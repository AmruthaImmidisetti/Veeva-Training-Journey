abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
        System.out.println(c.area());
    }
}
