package lesson5;

public class Box<T extends Fruit> {

    private T fruitObj;
    private int fruitCount;

    final int maxCount = 15;
    final int minCount = 0;

    public Box(T fruitObj, int fruitCount) {
        this.fruitObj = fruitObj;
        this.fruitCount = fruitCount;
    }

    public T getFruitObj() {
        return fruitObj;
    }

    public void setFruitObj(T fruitObj) {
        this.fruitObj = fruitObj;
    }

    public float getWeight() {                                     // 4.
        float boxWeight = fruitObj.getWeight() * fruitCount;
        return boxWeight;
    }

    public boolean compare(Box<?> another) {                          //5.
        return this.getWeight() == another.getWeight();
    }


    public boolean isTrue = true;

    public void putFruit(Box<T> anotherBox, int nubs) {                            //7.
        if (fruitCount + nubs <= maxCount) {
            anotherBox.fruitCount += nubs;
            System.out.println("В этой коробке " + fruitCount + " фруктов, можно положить ещё " + (maxCount - fruitCount) + " фруктов ");
        } else if (fruitCount + nubs > maxCount) {
            isTrue = false;
            System.out.println("Слишком много хотите положить, нет столько места");
        } else {
            System.out.println("Коробка полна фруктов ");
        }
    }
}
