public class Salary {
    int empeno; // 사원번호
    int grade; // 급
    int yearClass; // 호
    int extra; // 수당
    int tot; //지급액
    double afterTot; // 차인지급액
    double tax; // 세금
    int salary; //급여
    int reMoney; // 조정액

    public Salary(int empeno, int grade, int yearClass, int extra) {
        this.empeno = empeno;
        this.grade = grade;
        this.yearClass = yearClass;
        this.extra = extra;
    }

    public int getEmpeno() {
        return empeno;
    }

    public void setEmpeno(int empeno) {
        this.empeno = empeno;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYearClass() {
        return yearClass;
    }

    public void setYearClass(int yearClass) {
        this.yearClass = yearClass;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAfterTot() {
        return afterTot;
    }

    public void setAfterTot(double afterTot) {
        this.afterTot = afterTot;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getReMoney() {
        return reMoney;
    }

    public void setReMoney(int reMoney) {
        this.reMoney = reMoney;
    }
}
