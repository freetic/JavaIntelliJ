import java.util.Scanner;

public class Input {
    Phone[] array;

    public Input(Phone[] array) {
        this.array = array;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("구분(영업용:1, 관청용:2, 가정용:3) : ");
            int side = sc.nextInt();
            System.out.print("전화번호 : ");
            String phoneNum = sc.next();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("통화량 : ");
            int using = sc.nextInt();
            array[i] = new Phone(side, phoneNum, name, using);
        }
    }
}

