package lesson4;

public class Cat extends Animal {

    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String ifHungry = !hungry? "не голоден" : "голоден";
        System.out.println(name + ": " + ifHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }

    @Override
    void swimming(int distance) {
        super.swimming(distance);
        System.out.println("Кот не будет плавать");
    }

    @Override
    void running(int distance) {
        super.running(distance);
        if (distance > 200) {
            System.out.println("Кот ленивый и не побежит дальше 200 метров");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }
}
