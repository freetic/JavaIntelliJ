public class SwitchDemo {
    public static void main(String[] args) {
        int num = 56;
        switch(num%2){
            case 0:
                System.out.println("짝수"); break;
            case 1:
                System.out.println("홀수"); break;
        }
    }
}
