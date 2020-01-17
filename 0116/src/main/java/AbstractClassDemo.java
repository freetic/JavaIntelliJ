public class AbstractClassDemo {
    public static void main(String[] args) {
        Birds buz = new Sparrow();
        buz.display2();
    }
}

abstract class Birds{
    final protected int numOfWings = 2;
    public abstract void display();
    public void display2(){
        System.out.println("새가 날다.");
    }
}
class Sparrow extends Birds{
    public void display(){
        System.out.println("참새가 날다");
    }
}