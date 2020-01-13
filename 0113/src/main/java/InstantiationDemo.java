public class InstantiationDemo {
    public static void main(String[] args) {
        int age = 0;        // 선언
        Car sonata = null;  // 선언
        age = 24;           // 할당
        sonata = new Car(); // 생성
        sonata.name = "소나타";    // 할당
        sonata.price = 25_000_000;
        sonata.maker = "hyundae";
        sonata.go(100);
        sonata.stop();
    }
}
