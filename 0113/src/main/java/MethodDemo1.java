import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        MethodDemo1 m = new MethodDemo1();
        Scanner sc = new Scanner(System.in);
        String y_n = null;
        do{
            int money = m.input(sc);
            m.output(money);
            System.out.print("Again(y/n)?");
            sc.next();
        } while(y_n.equals("Y") || y_n.equals("y"));

    }
    int input(Scanner sc){
        System.out.print("Money : ");
        return sc.nextInt();
    }
    void output(int money){
        int[] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + "원 : " + money/array[i]);
            money = money % array[i];
        }
    };
}
