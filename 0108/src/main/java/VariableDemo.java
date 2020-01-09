public class VariableDemo {
    public static void main(String[] args) {
        System.out.println("age = " + Employee.age);
        System.out.println("name = " + new Employee().name);
    }
}
class Employee{
    String name = "한지민";        // member variable / instance variable
    static int age = 24;     // static variable / class variable
}
