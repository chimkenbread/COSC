// SiameseCat.java
public class SiameseCat extends HouseCat {
    public SiameseCat(String name, int age, String furColor) {
        super(name, age, furColor);
    }
        @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meeoow in a high pitch!");
    }
}
