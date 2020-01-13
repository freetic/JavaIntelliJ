public class ReturnDemo {
    public static void main(String[] args) {
        double su = change(52); // 매ㅐㅈㅅ
        System.out.println("su = " + su);
    }
    public static double change(int num){   // 매개변수
        if(num%2 == 0) return 5.0;
        System.out.println("Hello");
        return 89.5;
    }
}
