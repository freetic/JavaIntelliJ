public class CastDemo {
    public static void main(String[] args) {
        Test t = new Test();
        Demo d = new Demo();

        if(t instanceof Demo){
            d = (Demo)t;
        }else{
            System.out.println("형 변환 불가.");
        }

    }

}
class Test{

}
class Demo extends Test{

}
