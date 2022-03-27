package lesson8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CreateTheArray {
    public static void main(String[] args) {
        String[] people = {"Саня", "Катя", "Саня", "Влад", "Вася", "Катя", "Виктор",
                "Вика", "Денис", "Кирилл", "Лена", "Вика", "Влад", "Вася", "Саня"};

        HashMap<String, Integer> arr = new HashMap<>();
        for (String name : people) {
            arr.put(name, arr.getOrDefault(name, 0) + 1);
        }
        System.out.println(arr);

        Set<String> uniqueName = new HashSet<>(Arrays.asList(people));
        System.out.println(uniqueName);
    }
}
