public class CallByValue {
    public static void main(String[] args) {
        int original = 77;
        System.out.println("Before call");
        System.out.println("original = " + original);
        CallByValue cbv = new CallByValue();
        original = cbv.change(original);
        System.out.println("After");
        System.out.println("original = " + original);
    }
    int change(int num){
        num*=num;
        System.out.println("in change() num = " + num);
        return num;
    }
}
