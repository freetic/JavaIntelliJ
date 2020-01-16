
public class Main {
    public static void main(String[] args) {
        PatientInfo[] patients = new PatientInfo[1];
        Input input = new Input(patients);
        input.input();

        System.out.println(patients[0].getCode());
//        Calc calc = new Calc(patients);
//        calc.calc();

        Output output = new Output(patients);
        output.output();
    }
}
