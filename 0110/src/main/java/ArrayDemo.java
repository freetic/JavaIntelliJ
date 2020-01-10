import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        /*int[] array = {5,6,7,8};
        for(int i = 0 ; i < array.length; i++){
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }*/

        /*int[] array = new int[4];
        array[0] = 100;     // 국어
        array[1] = 90;      // 영어
        array[2] = 75;      // 수학

        for(int i = 0; i < array.length -1 ;i++) array[3] += array[i];  // 총점 구하기*/

        /*int[] original = {1,2,3,4,5,6,7,8,9};
        int[] target = new int[2];      // 0 0
        original = target;              // 배열의 주소 복사 (단순 객체 복사, 얕은 복사)
        System.out.println(original[0]);
        target[0] = 100;
        System.out.println(original[0]);*/


        /*int[] original = {1,2,3,4,5,6,7,8,9};
        int[] target = {10, 11};

        System.arraycopy(target, 0, original, 5, 2);
        for(int i = 0; i < original.length; i++){
            System.out.print(original[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < target.length; i++){
            System.out.print(target[i] + " ");
        }*/

        /*Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }*/

        /*int i = 1;
        int max= array[0], min = array[0];
        while(i < array.length){
            if(max < array[i]) max = array[i];
            if(min > array[i]) min = array[i];
            i++;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);*/

        /*int[] arr = {6,9,2,5,1,7,2,3,5,9,3};
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }*/

        Scanner scan = new Scanner(System.in);
        String[] array = new String[4];
        System.out.print("Name : "); array[0] = scan.nextLine();
        System.out.print("Tel : "); array[1] = scan.nextLine();
        System.out.print("Email : "); array[2] = scan.nextLine();
        System.out.print("Adress : "); array[3] = scan.nextLine();
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
