public class CallByReference {
    public static void main(String[] args) {
        Test t = new Test();
        t.original = 500;

        CallByReference cbr = new CallByReference();
        cbr.change(t);
        System.out.println(t.original);
    }
    void change(int num) {
        num *= 100;
        System.out.println("in change() num = " + num);
    }
    Test change(Test t){
        t.original *= t.original;
        return t;
    }
}

class Test{
    int original;       // member variable
}
