public class ArrayDemo3 {
    public static void main(String[] args) {
        /*Car sonata = new Car();
        sonata.name = "Sonata";
        sonata.price = 25_000_000;
        Car carnival = new Car();
        carnival.name = "Carnival";
        carnival.price = 30_000_000;*/

        /*Car[] array;        // 선언
        array = new Car[2]; // 배열 생성
        array[0] = new Car();
        array[1] = new Car(); // 객체 생성

        array[0].name ="sonata";
        array[0].price = 25_000_000;
        array[1].name = "Carnival";
        array[1].price = 30_000_000;
        for(int i=0; i< array.length ; i++){
            System.out.println("이름 = " + array[i].name + ", 가격 = " + array[i].price);*/

        Student[] array;
        array = new Student[]{new Student(), new Student()};
        array[0].name = "한지민";
        array[1].name = "김지민";
        array[0].address = "서울시 강남구 역삼동";
        array[1].address = "부산시 해운대구 해운대동";
        for(Student s : array){
            System.out.println(s.name);
            System.out.println(s.address);
            System.out.println("----------");
        }
    }
}
class Student{
    String name, address;
}

/*
class Car{
    String name;
    int price;
}*/
