import java.util.Scanner;

/**
 * 백준 문제 풀이용 Main 클래스
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while(num != 1){
            if(num %3 == 0) num /= 3;
            else if(num %2 == 0) num /= 2;
            else num-=1;
            count++;
        }
        System.out.println(count);
    }
}