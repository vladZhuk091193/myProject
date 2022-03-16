package lesson4;

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int difference = food - n;
        if (difference < 0) return false;

        food -= n;
        return true;
    }

    void plusFood(int food) {
        this.food += food;
    }

    void information() {
        System.out.println("plate: " + food);
    }
}

