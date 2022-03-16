package lesson4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void swimming(int distance) {
        super.swimming(distance);
        if (distance > 10) {
            System.out.println("Собачка не поплывет дальше 10 метров");
        } else {
            System.out.println("Собачка проплыла " + distance + " метров");
        }
    }
}

