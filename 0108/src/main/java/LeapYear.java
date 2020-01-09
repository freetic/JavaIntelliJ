import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year : ");
        int n = sc.nextInt();
        String result = (n%400 == 0)? "윤년" :
                        (n%100 == 0)? "평년" :
                        (n%4 == 0)? "윤년" : "평년";
        System.out.println(n + "년은 \"" + result + "\" 입니다.");

    }
}
