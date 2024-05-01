public class Marker {
    public static void main(String[] args) {
        Marker marker = new Marker("Blue", "Sharpie", 5.0);
        System.out.println("Color: " + marker.getColor());
        System.out.println("Brand: " + marker.getBrand());
        System.out.println("Size: " + marker.getSize());
    }

    private String color;
    private String brand;
    private double size;

    public Marker(String color, String brand, double size) {
        this.color = color;
        this.brand = brand;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
