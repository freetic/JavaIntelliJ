public class Main {
    public static void main(String[] args) {
        Salary[] employees = new Salary[10];
        Input input = new Input(employees);
        int n = intput.input();

        Calc calc = new Calc(employees, n);
        calc.calc();

//        employees[0] = new Salary();
//        employees[0].setEmpeno(10);
//        employees[0].setGrade(2);
//        employees[0].setYearClass(50);
//        employees[0].setExtra(50);
//        employees[0].setTot(5);
//        employees[0].setTax(5.12);
//        employees[0].setAfterTot(100.1);

        Output output = new Output(employees, 1);
        output.output();
    }
}
