package lesson8;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {

    HashMap<String, ArrayList<String>> telephoneMap = new HashMap<>();

    public static void main(String[] args) {

        TelephoneBook list = new TelephoneBook();
        list.add("Смольков", "+375(29)1111111");
        list.add("Смольков", "+375(29)2222222");
        list.add("Петров", "+375(29)3333333");
        list.add("Смольков", "+375(33)8888888");

        int num = 0;
        for (String o : list.get("Смольков")) {
            num++;
            System.out.println("Смольков " + num + " телефон: " + o);
        }
    }

    public ArrayList<String> get(String name) {
        return telephoneMap.get(name);
    }

    public void add(String name, String phone) {
        ArrayList<String> addNumber = telephoneMap.get(name);
        System.out.println("Номер телефона = " + addNumber);
        if (addNumber == null) {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phone);
            telephoneMap.put(name, numbers);
        } else {
            addNumber.add(phone);
            telephoneMap.put(name, addNumber);
        }
    }
}

