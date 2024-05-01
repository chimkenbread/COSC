public class ObjectTest {
    public static void main(String[] args) {
        // Creating objects of Marker class
        Marker marker = new Marker("Blue", "Sharpie", 5.0);

        // Creating objects of Apple class
        Apple apple = new Apple("Red Delicious", "Red", 0.2);

        // Creating objects of Cat class
        Cat cat = new Cat("Whiskers", "Siamese", 3);

        // Displaying information
        System.out.println("Marker:");
        System.out.println("Color: " + marker.getColor());
        System.out.println("Brand: " + marker.getBrand());
        System.out.println("Size: " + marker.getSize() + " mm");

        System.out.println();

        System.out.println("Apple:");
        System.out.println("Type: " + apple.getType());
        System.out.println("Color: " + apple.getColor());
        System.out.println("Weight: " + apple.getWeight() + " kg");

        System.out.println();

        System.out.println("Cat:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Age: " + cat.getAge() + " years");
    }
}
