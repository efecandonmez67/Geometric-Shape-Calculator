public class Sphere extends Shape implements IDrawable{
    public double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius * 2;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with radius "+radius);
    }
}
