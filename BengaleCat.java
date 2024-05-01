// BengalCat.java
public class BengalCat extends HouseCat {
    private boolean hasWildAncestry;

    public BengalCat(String name, int age, String furColor, boolean hasWildAncestry) {
        super(name, age, furColor);
        this.hasWildAncestry = hasWildAncestry;
    }

    @Override
    public void makeSound() {
        // A mix between a domestic cat's meow and a wild growl
        System.out.println(getName() + " says: Meow-growl!");
    }

    public boolean hasWildAncestry() {
        return hasWildAncestry;
    }
}
