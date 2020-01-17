public class PolymorphismDemo2 {
    public static void main(String[] args) {
        Parent1 parent = new Child1();
        ((Child1)parent).show();        // 강제 형변환 시 가능
    }
}
class Parent1{
    public void display(){
        System.out.println("부모의 display()");
    }
    public void print(){
        System.out.println("부모의 print()");
    }
}

class Child1 extends Parent1{
    public void show(){
        System.out.println("자식의 show()");
    }
    @Override
    public void display(){
        System.out.println("자식의 print()");
    }
}
