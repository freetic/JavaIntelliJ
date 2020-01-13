import java.util.Scanner;

public class VariableArgumentDemo {
    public static void main(String[] args) {
        display(4, 1, 2, 6, 7,34, 'Z');
    }
    static void display(int... arr){      // 가변인자
        System.out.println(arr.length);        Scanner sc = new Scanner(System.in);
        for(Object i : arr){
            System.out.println(i);
        }
    }
}
