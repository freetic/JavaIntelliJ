import java.util.Scanner;

/**
 * 백준 문제 풀이용 Main 클래스
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(arr[(int)str.charAt(i)-97] == -1){
                arr[(int)str.charAt(i)-97] = i;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}