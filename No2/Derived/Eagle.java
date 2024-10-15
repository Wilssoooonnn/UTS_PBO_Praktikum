package Derived;

import SubClass.Bird;

public class Eagle extends Bird {
    public int huntingSKill, eyesightStrength;

    public Eagle(String species, int age, int weight, int WingSpan, String beakType, int huntingSKill,
            int eyesightStrength) {
        super(species, age, weight, WingSpan, beakType);
        this.huntingSKill = huntingSKill;
        this.eyesightStrength = eyesightStrength;
    }

    public void hunt() {
        System.out.println("Hunting");
    }

    public void soar() {
        System.out.println("Soaring");
    }

    public String displayInfo() {
        String info = "";
        info += "Species: " + super.species + "\n";
        info += "Age: " + super.age + "\n";
        info += "Weight: " + super.weight + "\n";
        info += "Wing Span: " + super.WingSpan + "\n";
        info += "Beak Type: " + super.beakType + "\n";
        info += "Hunting Skill: " + this.huntingSKill + "\n";
        info += "Eyesight Strength: " + this.eyesightStrength + "\n";
        return info;
    }
}