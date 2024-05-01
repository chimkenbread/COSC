public class HouseCat extends Cat {
    private String furColor;

    public HouseCat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " purrs: Purr!");
    }

    // Getter and Setter for furColor
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
