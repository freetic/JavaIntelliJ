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

        Scanner sc = new Scanner(System.in);
        System.out.print(""); int n = sc.nextInt();
        for(int i=0; i < n; i++) {
            if( i < n/2+1){
                for (int j = 0; j < n - i - 1; j++) System.out.print(" \t");
                for (int j = 0; j < 2 * i + 1; j++) System.out.print("*\t");
            }else{ // i=6 j=
                for (int j = 0; j < ; j++) System.out.print(" \t");
                for (int j = 0; j < i + 1; j++) System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
