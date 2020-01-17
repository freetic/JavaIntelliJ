public class Employee implements IPerson{
    private String empno;
    private double salary;

    public Employee(){}

    public Employee(String empno, double salary) {
        this.empno = empno;
        this.salary = salary;
    }

//    public Employee(String name, int age, String address, String empno, double salary) {
//        super(name, age, address);
//        this.empno = empno;
//        this.salary = salary;
//    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return String.format("이름:%s, 나이:%d, 주소:%s, 사원번호:%s, 월급:%.1f", this.getName(),
//                this.getAge(), this.getAddress(), this.getEmpno(), this.getSalary());
//    }

    @Override
    public void printInfo() {
        System.out.println("사번 = " + empno + ", 봉급 = " + salary);
    }
}
