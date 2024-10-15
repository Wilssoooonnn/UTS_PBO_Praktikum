package Base;

/**
 * Animals
 */
public class Animals {

    protected String species;
    protected int age, weight;

    public Animals(String species, int age, int weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public String displayInfo() {
        String info = "";
        info += "Species: " + this.species + "\n";
        info += "Age: " + this.age + "\n";
        info += "Weight: " + this.weight + "\n";
        return info;
    }
}