package lesson5;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox1 = new Box<Apple>(apple, 9);
        System.out.println(appleBox1.getWeight());
        Box<Apple> appleBox2 = new Box<Apple>(apple, 3);
        System.out.println(appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<Orange>(orange, 6);
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(orangeBox));
        appleBox1.putFruit(appleBox1,3);
        orangeBox.putFruit(orangeBox,243);
    }
}
