import java.util.Scanner;

public class OpDemo {
    public static void main(String[] args) {
        int age = 24;
        System.out.println("age = " + Integer.toBinaryString(age) + " / " + age);
//        int result = age << 12;
//        System.out.println("result = " + Integer.toBinaryString(result) + " / " + result);
//        int result = age >>> 4; // -24 / 2^4
//        System.out.println("result = " + result);
//        System.out.println((age % 2 ==0)? "짝수" : "홀수");
        double avg = 59.5;
        char grade = (90 <= avg && avg <=100)? 'A':
                        (80 <= avg && avg < 90)? 'B':
                        (70 <= avg && avg < 80)? 'C':
                        (60 <= avg && avg < 70)? 'D':'F';
        System.out.println(grade);
    }
}
