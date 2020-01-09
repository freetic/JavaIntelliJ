import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        int comp_rand = (int)(Math.random()*6+1);
        while(flag){
            flag = false;
            System.out.print("Insert a value(1 ~ 6) : ");
            int user_value = sc.nextInt();
            if(user_value < 1 || user_value > 6){
                System.out.println("잘못 입력하셨습니다.");
                System.exit(-1);
            }
            System.out.println("나 : " + user_value + ",\t컴퓨터 : " + comp_rand);
            if(comp_rand > user_value){
                System.out.println("패배");
            } else if (comp_rand < user_value){
                System.out.println("승리");
            } else {
                System.out.println("비김");
                flag = true;
            }
        }
    }
}