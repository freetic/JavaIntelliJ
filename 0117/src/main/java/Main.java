public class Main {
    public static void main(String[] args) {
//        Dept[] depts = inputDept();         // 부서 입력
//        Emp[] emps = inputEmp();            // 노동자 입력
//        Scanner sc = new Scanner(System.in);    // 이름 받기
//        String name = sc.next();
//        output(depts, emps, name);          // 출력

//        Person chulsu = new Student ("김철수", 24, "강남구 역삼동", "2019-01", 90);
//        Person jimin = new Employee("한지민", 34, "부산시 해운대구", "2018-05", 250);
//        System.out.println("철수의 정보");
//        System.out.println(chulsu);
//        System.out.println("한지민의 정보");
//        System.out.println(jimin);
    }
    private static Dept[] inputDept(){
        Dept[] depts = new Dept[4];
        depts[0] = new Dept(10, "ACCOUNTING", "NEW YORK");
        depts[1] = new Dept(20, "RESEARCH", "DALLAS");
        depts[2] = new Dept(30, "SALES", "CHICAGO");
        depts[3] = new Dept(40, "OPERATIONS", "BOSTON");
        return depts;
    }
    private static Emp[] inputEmp(){
        Emp[] emps = new Emp[15];
        emps[0] = new Emp(7369, "SMITH", "CLERK", 7902, "80/12/17", 800, 0, 20);
        emps[1] = new Emp(7499, "ALLEN", "SALESMAN", 7698, "81/02/20", 1600, 300, 30);
        emps[2] = new Emp(7521, "WARD", "SALESMAN", 7698, "81/02/22", 1250, 500, 30);
        emps[3] = new Emp(7566, "JONES", "MANAGER", 7839, "81/04/02", 2975, 0, 20);
        emps[4] = new Emp(7654, "MARTIN", "SALESMAN", 7698, "81/09/28", 1250, 1400, 30);
        emps[5] = new Emp(7698, "BLAKE", "MANAGER", 7839, "81/05/01", 2850, 0, 30);
        emps[6] = new Emp(7782, "CLARK", "MANAGER", 7839, "81/06/09", 2450, 0, 10);
        emps[7] = new Emp(7788, "SCOTT", "ANALYST", 7566, "87/04/19", 3000, 0, 20);
        emps[8] = new Emp(7839, "KING", "PRESIDENT", 0, "81/11/17", 5000, 0, 10);
        emps[9] = new Emp(7844, "TURNER", "SALESMAN", 7698, "81/09/08", 1500, 0, 30);
        emps[10] = new Emp(7876, "ADAMS", "CLERK", 7788, "87/05/23", 1100, 0, 20);
        emps[11] = new Emp(7900, "JAMES", "CLERK", 7698, "81/12/03", 950, 0, 30);
        emps[12] = new Emp(7902, "FORD", "ANALYST", 7566, "81/12/03", 3000, 0, 20);
        emps[13] = new Emp(7934, "MILLER", "CLERK", 7782, "82/01/23", 1300, 0, 10);
        emps[14] = new Emp(9999, "MILLER", "Fuck", 7782, "82/01/23", 99999, 1000000, 30);
        return emps;
    }
    private static void output(Dept[] depts, Emp[] emps, String name){
        int count = 0;
        for (Dept d : depts) {
            for (Emp e : emps) {
                if (e.geteName().equals(name.toUpperCase()) && d.getDeptNo() == e.getDeptNo()) {
                    if(count > 0){
                        System.out.println("---------------------------------------");
                    }
                    count++;
                    System.out.println("사번 : " + e.getEmpNo());
                    System.out.println("이름 : " + e.geteName());
                    System.out.println("직무 : " + e.getJob());
                    System.out.println("소속 부서 이름 : " + d.getdName());
                    System.out.println("소속 부서 위치 : " + d.getLoc());
                }
            }
        }
    }
}