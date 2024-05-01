public class Apple {
    public static void main(String[] args) {
        Apple apple = new Apple("Red Delicious", "Red", 0.2);
        System.out.println("Type: " + apple.getType());
        System.out.println("Color: " + apple.getColor());
        System.out.println("Weight: " + apple.getWeight());
    }

    private String type;
    private String color;
    private double weight;

    public Apple(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
