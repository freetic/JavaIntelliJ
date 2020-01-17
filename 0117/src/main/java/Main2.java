public class Main2 {
    public static void main(String[] args) {
        Car sonata = new Car("소나타", 2500);
        Object genesis= new Car("제네시스", 7500);
        Car carnival = new Car("카니발", 3500);

        Car[] cars = {sonata, (Car)genesis, carnival};
        for(int i = 0; i < cars.length-1; i++){
            for(int j=0; j < cars.length-1-i; j++){
                if(cars[j].compareTo(cars[j+1]) > 0){
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }
        }

        for(Car car : cars){
            System.out.println(car);
        }

    }
}