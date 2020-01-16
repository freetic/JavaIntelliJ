public class Car {
    private String name, maker;
    private int price;
    public Car(){

    }
    public Car(String name, String maker, int price) {
        this.name = name;
        this.maker = maker;
        this.price = price;
    }
    public Car(String name){
        this.name = name;

    }
    public Car(int price){
        this.price = price;
    }
    public Car(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Car(int price, String maker){
        this.price = price;
        this.maker = maker;
    }


    public void display(){
        System.out.printf("이름 = %s, 메이커 = %s, 가격 = %d", name, maker , price);
    }
}
