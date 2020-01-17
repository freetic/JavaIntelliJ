public class FinalDemo1 {
    public static void main(String[] args) {
        Bumo bumo = new Jasik();
        bumo.display();
    }

}

final class Bumo{
    public final void display(){
        System.out.println("나는 부모의 메소드입니다.");
    }
}
class Jasik extends Bumo{
    @Override
    public void display() {
        System.out.println("나는 자식의 메소드다 임마.");
    }
}
