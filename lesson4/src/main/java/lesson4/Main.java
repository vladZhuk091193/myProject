package lesson4;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack");
        Dog dog1 = new Dog("Lari");
        Cat cat1 = new Cat("Tom", 5);
        Cat cat2 = new Cat("Jerry", 10);


        cat1.running(29);
        dog.swimming(5);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Lol", 5);
        cats[1] = new Cat("Pop", 10);
        cats[2] = new Cat("Kok", 35);


        Plate plate = new Plate(15);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.plusFood(55);
        plate.information();
    }

}
