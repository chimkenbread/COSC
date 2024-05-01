// Tiger.java
public class Tiger extends WildCat {
    private boolean isEndangered;

    public Tiger(String name, int age, String habitat, boolean isEndangered) {
        super(name, age, habitat);
        this.isEndangered = isEndangered;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " growls: Grrr!");
    }

    // Getter for isEndangered
    public boolean isEndangered() {
        return isEndangered;
    }
}
