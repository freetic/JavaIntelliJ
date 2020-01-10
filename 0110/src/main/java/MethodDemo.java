public class MethodDemo {
    public static void main(String[] args) {
        calcSum(10  , 50);
        char c = '5';
        System.out.println((int)c-48);
    }

    public static void calcSum(int s, int n){
        int sum=0;
        for(int i = s; i <= n; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
