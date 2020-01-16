import java.util.Scanner;

public class Input {
    private Scanner sc;
    private Student[] array;

    public Input(Student[] array){
        sc = new Scanner(System.in);
        this.array = array;
    }
    public void input(){
        for(int i = 0; i < array.length; i++) {
            String hakbun, name;
            int kor, eng, mat;
            System.out.print("학번 : ");
            hakbun = sc.next();
            System.out.print("이름 : ");
            name = sc.next();
            System.out.print("국어 : ");
            kor = sc.nextInt();
            System.out.print("영어 : ");
            eng = sc.nextInt();
            System.out.print("수학 : ");
            mat = sc.nextInt();
            array[i] = new Student(hakbun, name, kor, eng, mat);
        }
    }

}
