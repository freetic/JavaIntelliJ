/**
 * Method Overriding
 * 1. 재정의 --> 수정
 * 2. Method의 필수 3요소(이름, 괄호(파라미터), 리턴타입)가 같은 메서드.
 * 3. 부모의 메서드가 상속이 안되는 이유는
 */
public class OverrideDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        System.out.println(child.toString());
        System.out.println(child);
        // 접근제한자 (Access Modifier) : private < (default) < protected < public
    }
}
class Parent{
    public void display(){
        System.out.println("부모 메서드");
    }
}

class Child extends Parent{
    void print(){
        super.display();
        this.display();
    }
    @Override
    public String toString(){
        return "Hello World!";
    }
    @Override
    public void display(){
        System.out.println("자식 메서드");
    }
}
