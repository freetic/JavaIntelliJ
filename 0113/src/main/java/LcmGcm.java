import java.util.Scanner;

public class LcmGcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int b = calcGcm(num1, num2);
        System.out.println("최대공약수 : " + b);

    }
    static int calcGcm(int a, int b){
        int tmp = (a > b)? b : a;
        int c = 0;
        for(int i = 2; i < tmp; i++){
            if((a % i == 0) && (b % i == 0)){
                c = i;
            }
        }
        return c;
    }
}