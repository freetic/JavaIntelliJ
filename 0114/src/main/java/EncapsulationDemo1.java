public class EncapsulationDemo1 {
    public static void main(String[] args) {
        Product ballpen = new Product();
        System.out.println(ballpen.name);
        System.out.println(ballpen.price);
        Calendar now = new Calendar();
        System.out.println(now.year);
    }
}
class Product{
    String name, maker;
    int price;
    public Product(){
        this.name = "모나미 볼펜";
        this.maker = null;
        this.price = 200;
    }
}

class Calendar{
    int year, month, day;
    public Calendar(){  //Default Constructor Overriding 오버 라이딩
        this.year = 2020;
        this.month = 1;
        this.day = 14;
    }
}
