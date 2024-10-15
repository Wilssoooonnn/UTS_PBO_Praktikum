package SubClass;

import Base.Animals;

public class Fish extends Animals {
    public int finCount;
    public String scaleType;

    public Fish(String species, int age, int weight, int finCount, String scaleType) {
        super(species, age, weight);
        this.finCount = finCount;
        this.scaleType = scaleType;
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void breathUnderwater() {
        System.out.println("Breathing Underwater");
    }

    public String displayInfo() {
        String info = "";
        info += "Species: " + super.species + "\n";
        info += "Age: " + super.age + "\n";
        info += "Weight: " + super.weight + "\n";
        info += "Fin Count: " + this.finCount + "\n";
        info += "Scale Type: " + this.scaleType + "\n";
        return info;
    }
}
