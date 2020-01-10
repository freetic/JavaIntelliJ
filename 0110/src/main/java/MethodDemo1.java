public class MethodDemo1 {
    public static void main(String[] args) {
        MethodDemo1 md1 = new MethodDemo1();
        System.out.println(md1.print(5.5));
    }

    // Method의 필수 구성요소
    /*public void print(String msg){
        System.out.println(msg);
    };*/

    double print(double weight){
        return weight*weight;
    }
}
