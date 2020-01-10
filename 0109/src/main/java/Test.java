import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1
        /*int result = 0;
        for(int i = 2; i <= 100; i+=2){
            result += i;
        }
        System.out.println(result);*/

        //2
        /*for(int i = 1; i <= 100; i++){
            if(i % 4 == 0 && i % 5 != 0) System.out.println(i);
        }*/

        //3
        /*for(int i = 1; i <= 100; i++){
            if(i % 4 == 0 && i % 5 == 0) System.out.println(i);
        }*/

        //4
        /*Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        int result = 1;
        for(int i = fac; i >= 1; i--){
            result *= i;
        }
        System.out.println(result);*/

        //5
        /*int result = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
             result += sc.nextInt();
        }
        System.out.println(result);*/

        Scanner scan = new Scanner(System.in);
        System.out.print("asas : ");
        int su = scan.nextInt();
        int num = su / 2 + 1;
        System.out.printf("\n");

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }

        for (int i = 1 ; i < num ; i++){
            for (int j = 0; j < i ; j++) {
                System.out.printf(" ");
            }
            for (int j = num - 1 ; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }
}
