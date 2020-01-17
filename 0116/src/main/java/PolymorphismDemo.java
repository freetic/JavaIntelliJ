public class PolymorphismDemo {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.display();
//        Child c = new Child();
//        c.display();
        Parent p = new Child();
        p.display();
        Object obj = new String("Hello");
    }
}
class Parent{
    public void display(){
        System.out.println("저는 부모 메소드입니다.");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("나는 자식 메소드다.");
    }
}
