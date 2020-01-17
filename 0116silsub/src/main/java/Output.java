public class Output {
    private Salary[] employees;
    int count;

    public Output(Salary[] employees, int count){
        this.employees = employees;
        this.count = count;
    }
    public void output(){
        printLabel();
        for(int i=0; i<count; i++){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.3f\t\t%.3f\n", employees[i].getEmpeno(), employees[i].getGrade(),
                    employees[i].getYearClass(), employees[i].getExtra(), employees[i].getTot(),
                    employees[i].getTax(), employees[i].getAfterTot());
        }
    }

    private static void printLabel(){
        System.out.println("                     <<급여 관리 프로그램>>");
        System.out.println("--------------------------------------------------------------");
        System.out.println("사번    급수    호    수당    지급액    세금    차인지급액");
        System.out.println("--------------------------------------------------------------");
    }
}
