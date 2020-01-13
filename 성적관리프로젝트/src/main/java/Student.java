public class Student {

    String hakbun, name;
    int kor, eng, mat, tot;
    double avg;
    char grade;
    void calc(){
        total = kor+eng+mat;
        avg = tot/3.0;
        grade = (avg >= 90)? 'A':
                (avg >= 80)? 'B':
                        (avg >= 70)? 'C':
                                (avg>= 60)?'D':'F';
    }
    void output(){
        System.out.printf("%s\t%s\t%d\t%c\n", hakbun, name, avg, grade);
    }
}
