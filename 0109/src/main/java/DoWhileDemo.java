import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args){
        /*int i = 10;
        do{
            System.out.printf("%d\t", i);
            i++;
        }while(i<=5);*/

//        int rand1, rand2, rand3;
//        do{
//            rand1 = (int)(Math.random()*6 + 1);
//            rand2 = (int)(Math.random()*6 + 1);
//            rand3 = (int)(Math.random()*6 + 1);
//
//        } while(rand1 == rand2 || rand2 == rand3 || rand1 == rand3);
//        System.out.println(rand1 + ", " + rand2 + ", " + rand3);

        /*int i = 1;
        do{
            int j = 2;
            do{
                System.out.print(j + " x " + i +  " = " + j*i + "\t");
                j++;
            }while(j <= 9);
            System.out.println();
            i++;
        }while(i <= 9);*/

        /*Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        String num1Str, num2Str;
        num1Str = sc.next(); int num1 = Integer.parseInt(num1Str);
        num2Str = sc.next(); int num2 = Integer.parseInt(num2Str);

        int result=0;
        if(num1 < num2){
            num1++;
            while(num1 < num2){
                result += num1;
                num1++;
            }
        } else if(num1 > num2){
            num2++;
            while(num2 < num1){
                result += num2;
                num2++;
            }
        }
        System.out.println(result);*/

        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0;
        int temp;
        boolean once = true;
        while((temp = sc.nextInt()) != 0){
            if(true){
                max = min = temp;
                once = false;
            }
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }
        System.out.println("max : " + max + ", min : " + min);
    }
}