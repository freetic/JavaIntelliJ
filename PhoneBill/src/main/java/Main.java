public class Main {
    public static void main(String[] args) {
        Phone[] array = new Phone[1];
        Input input = new Input(array);
        input.input();

        Calc calc = new Calc(array);
        calc.calc();

        Output output = new Output(array);
        output.output();
    }
}
