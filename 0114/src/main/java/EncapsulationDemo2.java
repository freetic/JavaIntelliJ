public class EncapsulationDemo2 {
    public static void main(String[] args) {
        Employee chulsu = new Employee();
        System.out.println(chulsu.name);
        System.out.println(chulsu.salary);
    }
}

class Employee{
    String name;
    int salary;
    // this() : 나의 생성자가 나의 또 다른 생성자를 호출 할 때.
    public Employee(){
        System.out.println("Hello World!");
        this("Unknown", 1000);
    }
    public Employee(String name){

    }
    public Employee(int salary){
        this.salary = salary;
    }
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        this(1000);
    }
}