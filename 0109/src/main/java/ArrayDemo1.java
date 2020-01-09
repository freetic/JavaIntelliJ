import java.util.Scanner;

// 입력한 순자중 가장 큰 값 뽑아내기
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        int start = 0;

        while(true){
            int su = array[start] = sc.nextInt();
            if(su == 0) break;
            array[start] = su;
            start++;
        }
        for(int i = 0; i < start/*array[i]!=0*/; i++){
            System.out.print(array[i] + "\t");
        }

    }
}
