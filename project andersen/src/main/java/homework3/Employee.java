package homework3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.age = age;
        this.email = email;
        this.position = position;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "manager", "ivav@gmail.com", 45123433, 100, 45);
        employees[1] = new Employee("Oleg", "manager", "oleg@gmail.com", 1234566, 120, 38);
        employees[2] = new Employee("Bogdan", "manager", "bogdan@gmail.com", 1234222, 180, 40);
        employees[3] = new Employee("Irina", "manager", "irina@gmail.com", 1234566, 150, 25);
        employees[4] = new Employee("Olga", "manager", "olga@gmail.com", 1234566, 120, 55);

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.age > 40) {
                System.out.println(employee);
            }

        }


    }

    public String infoAboutEmployee() {
        return "age: " + age + "; name: " + name + "; position: " + position + "; email: " + email + "; phone: " + phone + "; salary: " + salary;
    }


}
