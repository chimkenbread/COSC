public class Cat {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", "Siamese", 3);
        System.out.println("Name: " + cat.getName());
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Age: " + cat.getAge());
    }

    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
