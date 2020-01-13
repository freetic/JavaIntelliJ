public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Main main = new Main();
        s1 = main.input();
        main.calc(s1);
        main.output(s1);
    }
    Student input(){
        Student chulsu = new Student();
        chulsu.hakbun = "2019-01";
        chulsu.name = "김철수";
        chulsu.kor = 90;
        chulsu.eng = 78;
        chulsu.mat = 100;
        return chulsu;
    }


}
