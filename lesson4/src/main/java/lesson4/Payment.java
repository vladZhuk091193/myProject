package lesson4;
import java.util.Scanner;

public class Payment {

    public String name = "";
    public int quantity;

    public Payment(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        Vegetables[] vega = new Vegetables[4];
        vega[0] = new Vegetables("cucumbers", 10, 1);
        vega[1] = new Vegetables("tomatoes", 15, 2);
        vega[2] = new Vegetables("carrot", 7, 3);
        vega[3] = new Vegetables("cabbage", 12, 4);
        for (int i = 0; i < vega.length; i++) {
            System.out.println(vega[i].name + " стоит " + vega[i].cost + " рублей");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("От 1 до 4 выберите,что Вы хотите купить: ");
        int choice = sc.nextInt();
        if (choice == vega[0].position || choice == vega[1].position || choice == vega[2].position || choice == vega[3].position) {
            System.out.println("Вы выбрали" + choice);
        } else {
            System.out.println("Повторяю, выберите от 1 до 4");
        }
    }

    class Vegetables {
        String name;
        int cost;
        int position;

        public Vegetables(String name, int cost, int position) {
            this.name = name;
            this.cost = cost;
            this.position = position;
        }
    }
}
