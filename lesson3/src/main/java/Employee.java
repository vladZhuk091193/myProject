public class Employee {
    private String name;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    public int age;

    public Employee(String name, String position, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println("Name: " + name + ", position: " + position + ", email: " + email + ", numberPhone: " + numberPhone + ", salary: " + salary + ", age: " + age);
    }

    public int getAge() {
        return age;
    }
}
