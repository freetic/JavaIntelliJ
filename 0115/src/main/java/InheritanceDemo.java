public class InheritanceDemo {
    public static void main(String[] args) {
        TwoD twoD = new TwoD();
        ThreeD threeD = new ThreeD();
        threeD.display();
    }
}
class TwoD{
    int x = 40, y = 50;
    void display(){
        System.out.println(x+ ", "+y);
    }
}
class ThreeD extends TwoD{
    int z;
}