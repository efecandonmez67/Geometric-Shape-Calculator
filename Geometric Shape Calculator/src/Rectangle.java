public class Rectangle extends Shape implements IDrawable {

    public double width, height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width+height);
    }

    @Override
    double calculateArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with height&width: " + height+width);

    }
}
