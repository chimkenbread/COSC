import java.util.Scanner;

//the base for all shapes.
abstract class Shape implements PerimeterCalculable, AreaCalculable {
}

//Interface for perimeter calculations.
interface PerimeterCalculable {
    double calculatePerimeter();
}

//Interface for area calculations.
interface AreaCalculable {
    double calculateArea();
}

//Triangle shape.
class Triangle extends Shape {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}

//Square shape.
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

//Pentagon shape.
class Pentagon extends Shape {
    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * side;
    }

    @Override
    public double calculateArea() {
        double apothem = side / (2 * Math.tan(Math.PI / 5));
        return 0.5 * calculatePerimeter() * apothem;
    }
}

//Octagon shape.
class Octagon extends Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 8 * side;
    }

    @Override
    public double calculateArea() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }
}

//Rhombus shape.
class Rhombus extends Shape {
    private double diagonal1, diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculatePerimeter() {
        double side = Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4);
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}

// CLI interaction and testing.
public class ShapeCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select shape (1=Triangle, 2=Square, 3=Pentagon, 4=Octagon, 5=Rhombus): ");
        int choice = scanner.nextInt();
        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter the sides of the Triangle (sideA sideB sideC): ");
                shape = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                break;
            case 2:
                System.out.println("Enter the side of the Square: ");
                shape = new Square(scanner.nextDouble());
                break;
            case 3:
                System.out.println("Enter the side of the Pentagon: ");
                shape = new Pentagon(scanner.nextDouble());
                break;
            case 4:
                System.out.println("Enter the side of the Octagon: ");
                shape = new Octagon(scanner.nextDouble());
                break;
            case 5:
                System.out.println("Enter the diagonals of the Rhombus (diagonal1 diagonal2): ");
                shape = new Rhombus(scanner.nextDouble(), scanner.nextDouble());
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        if (shape != null) {
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
