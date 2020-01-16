public class Lion extends Mammal{
    String name = "한지민";

    public void display() {
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class Mammal{
    String name = "김지민";
}