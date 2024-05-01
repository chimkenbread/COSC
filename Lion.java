// Lion.java
public class Lion extends WildCat {
    public Lion(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly: Roarrr!");
    }
}
