package Exercise6;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 4);

        System.out.println("RECTANGLE");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " +
                           rectangle.calculatePerimeter());

        Circle circle = new Circle(3);

        System.out.println("\nCIRCLE");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " +
                           circle.calculatePerimeter());
    }
}
