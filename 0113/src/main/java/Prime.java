public class Prime {
    public static void main(String[] args) {
        for(int i=2; i<=50; i++){
            printPrime(i);
        }
    }
    static void printPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime) System.out.print(n+"\t");
    }
}
