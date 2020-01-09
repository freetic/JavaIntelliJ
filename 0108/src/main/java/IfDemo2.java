import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학번 : ");
        int stuNo = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int mat = sc.nextInt();
        int total = kor+eng+mat;
        double avg = total/3.0;
        String pj;

        /*if(avg >= 90 && avg <= 100){
            pj = "A";
        } else if(avg >= 80 && avg < 90){
            pj = "B";
        } else if(avg >= 70 && avg < 80){
            pj = "C";
        } else if (avg >= 60 && avg < 70) {
            pj = "D";
        } else{
            pj = "F";
        }*/

        switch((int)(avg/10)){
            case 10:
            case 9: pj = "A"; break;
            case 8: pj = "B"; break;
            case 7: pj = "C"; break;
            case 6: pj = "D"; break;
            default: pj="F"; // default는 중간에 써도 된다.
        }   // 이게 낫다.
        System.out.printf("%s(%d),\t%d\t%d\t%d\t%d\t%.2f\t%s", name, stuNo, kor, eng, mat, total, avg, pj);
    }
}
