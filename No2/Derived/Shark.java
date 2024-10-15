package Derived;

import SubClass.Fish;

public class Shark extends Fish {
    public int jawStrength, teethCount;

    public Shark(String species, int age, int weight, int finCount, String scaleType, int jawStrength, int teethCount) {
        super(species, age, weight, finCount, scaleType);
        this.jawStrength = jawStrength;
        this.teethCount = teethCount;
    }

    public void senseVibrations() {
        System.out.println("Sensing Vibrations");
    }

    public void huntPrey() {
        System.out.println("Hunting Prey");
    }

    public String displayInfo() {
        String info = "";
        info += "Species: " + super.species + "\n";
        info += "Age: " + super.age + "\n";
        info += "Weight: " + super.weight + "\n";
        info += "Fin Count: " + super.finCount + "\n";
        info += "Scale Type: " + super.scaleType + "\n";
        info += "Jaw Strength: " + this.jawStrength + "\n";
        info += "Teeth Count: " + this.teethCount + "\n";
        return info;
    }
}
