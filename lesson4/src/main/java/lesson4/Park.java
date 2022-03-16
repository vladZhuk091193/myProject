package lesson4;

import java.util.Scanner;

public class Park {
    public String name = "";

    public Park(String name) {
        this.name = name;

        Attraction[] type = new Attraction[3];
        type[0] = new Attraction("Карусель", 5, 10, 1);
        type[1] = new Attraction("Машинки", 5, 12, 2);
        type[2] = new Attraction("Колесо обозрения", 15, 25, 3);
        for (int i = 0; i < type.length; i++) {
            System.out.println(type[i].name + " стоит " + type[i].time + " минут " + type[i].cost + " рублей");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Какие атракцион Вас интересует? Выберите позицию от 1 до 3: ");
        int choice = sc.nextInt();
        if (choice == type[0].position || choice == type[1].position || choice == type[2].position || choice == type[3].position) {
            System.out.println("Вы выбрали" + choice);
        } else {
            System.out.println("У нас только три атракциона, выберите от 1 до 3, пожалуйста");
        }
    }

    class Attraction {
        String name;
        int time;
        int cost;
        int position;

        public Attraction(String name, int time, int cost, int position) {
            this.name = name;
            this.cost = cost;
            this.time = time;
            this.position = position;
        }
    }
}