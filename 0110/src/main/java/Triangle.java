import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("밑면 : ");
        double base = sc.nextDouble();
        System.out.print("높이 : ");
        double height = sc.nextDouble();
        System.out.printf("삼각형의 넓이 : %.2f\n", height*base/2);
    }
}
