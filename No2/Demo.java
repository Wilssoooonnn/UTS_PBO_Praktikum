import Base.Animals;
import SubClass.*;
import Derived.*;

public class Demo {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", 1, 2, 3, "Yellow");
        // bird.fly();
        Shark shark = new Shark("Tiger Shark", 5, 6, 7, "Blue", 8, 9);
        // shark.senseVibrations();
        // shark.huntPrey();
        // shark.swim();
        // shark.eat();
        System.out.println(shark.displayInfo());
        System.out.println(bird.displayInfo());
    }
}
