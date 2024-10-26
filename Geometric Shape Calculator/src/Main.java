import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Geometric Shape Calculator");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Sphere");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            Shape shape = null;

            switch (choice) {
                case 1:
                    // Circle seçimi
                    System.out.print("Enter the radius of the circle: ");
                    double radiusCircle = scanner.nextDouble();
                    shape = new Circle(radiusCircle);
                    break;
                case 2:
                    // Rectangle seçimi
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case 3:
                    // Sphere seçimi
                    System.out.print("Enter the radius of the sphere: ");
                    double radiusSphere = scanner.nextDouble();
                    shape = new Sphere(radiusSphere);
                    break;
                case 4:
                    // Exit seçimi
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option! Please choose between 1-4.");
                    continue;
            }

            if (shape != null) {
                shape.displayInfo();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println();
            }
        }

        scanner.close();
    }
}
