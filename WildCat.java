public class WildCat extends Cat {
    private String habitat;

    public WildCat(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars: Roar!");
    }

    // Getter and Setter for habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
