package SubClass;

import Base.Animals;

/**
 * Bird
 */
public class Bird extends Animals {
    public int WingSpan;
    public String beakType;

    public Bird(String species, int age, int weight, int WingSpan, String beakType) {
        super(species, age, weight);
        this.WingSpan = WingSpan;
        this.beakType = beakType;
    }

    public void fly() {
        System.out.println("Flying");
    }

    public String displayInfo() {
        String info = "";
        info += "Species: " + super.species + "\n";
        info += "Age: " + super.age + "\n";
        info += "Weight: " + super.weight + "\n";
        info += "Wing Span: " + this.WingSpan + "\n";
        info += "Beak Type: " + this.beakType + "\n";
        return info;
    }
}
