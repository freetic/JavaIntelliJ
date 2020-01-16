public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("차", 0);
        System.out.println(car1.getName());
        System.out.println(car1.getPrice());
    }
}
class Car{
    private String name;
//    private int price = 500; <- 명시적 초기화 (가장 먼저)
    private int price;
    {   // 인스턴스 초기화 블록
        this.name = "자동차";
        this.price = 1000;
        System.out.println("기본값으로 설정됐습니다.(생성자보다 빠르다 -> 생성자에 덮인다.)");
    }
    public Car(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("방금 객체가 생성되었습니다.");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}