abstract class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape Name: " + name);

    }
}
