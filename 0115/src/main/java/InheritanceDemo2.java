public class InheritanceDemo2 {
    public static void main(String[] args) {
        Student chulsu = new Student("2019-01", "한지민", 29);
        Employee jimin = new Employee("Handok", "김지민", 30);
        System.out.println("나이 : " + chulsu.getAge());
        System.out.println("나이 : " + jimin.getAge());
    }
}
