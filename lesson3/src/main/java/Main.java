public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new Employee("Andreev Andrey Andreevich", "manager", "andry@gmail.com", "+375332125578", 1950, 43);
        array[1] = new Employee("Zaycev Ivan Andreevich", "accountant", "fly@gmail.com", "+37529321341", 1400, 38);
        array[2] = new Employee("Petrov Andrey Ivanovich", "economist", "petya12@gmail.com", "+375335684230", 1100, 28);
        array[3] = new Employee("Ivanov Petr Maksimovich", "accountant", "ivanov121@gmail.com", "+37533789214", 1200, 51);
        array[4] = new Employee("Maksimov Ilya Petrovich", "economist", "ilya@gmail.com", "+375298785614", 1500, 41);

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                array[i].information();
            }
        }
    }
}
