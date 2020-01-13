public class ConstructorDemo {
    public static void main(String[] args) {
        Product ballpen = new Product("볼펜", 1000, "모나미");
        ballpen.output();
        Product sharpPencil = new Product();
        sharpPencil = null;
        System.gc();

    }
}

class Product{
    String name;
    int price;
    String maker;
    // 생성자 - constructor
    Product(){}
    Product(String name, int price, String maker){
        this.name = name;
        this.price = price;
        this.maker = maker;
        System.out.println("방금 객체가 생성되었습니다.");
    }
    void output(){
        System.out.println("제품명 : " + this.name);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.maker);
    }
    // 소멸자 - destructor
    protected void finalize(){
        System.out.println("방금 객체가 소멸되었습니다.");
    }
}