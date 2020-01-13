public class Sequence {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 1; i <= 50; i++){
            result += sum(i);
        }
        System.out.println(result);
    }
    static int sum(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            result+=i;
        }
        return result;
    }
}

