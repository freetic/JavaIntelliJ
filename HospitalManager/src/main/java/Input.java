import java.util.Scanner;

public class Input {
    private PatientInfo[] patients;
    public Input(PatientInfo[] patients){
        this.patients = patients;
    }
    public void input(){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < patients.length; i++) {
            System.out.print("번    호 : ");
            int num = sc.nextInt();
            System.out.print("진료코드 : ");
            String code = sc.next();
            System.out.print("입원일수 : ");
            int day = sc.nextInt();
            System.out.print("나    이 : ");
            int age = sc.nextInt();
            patients[i] = new PatientInfo(code.toUpperCase(), age,  day, num);

            if(code.toUpperCase().equals("MI")){
                patients[i].setDept("외과");
            }else if(code.toUpperCase().equals("NI")){
                patients[i].setDept("내과");
            }else if(code.toUpperCase().equals("SI")){
                patients[i].setDept("피부과");
            }else if(code.toUpperCase().equals("TI")){
                patients[i].setDept("소아과");
            }else if(code.toUpperCase().equals("VI")){
                patients[i].setDept("산부인과");
            }else if(code.toUpperCase().equals("WI")) {
                patients[i].setDept("비뇨기과");
            } else{
                System.out.println("진찰부서 입력 오류");
                System.exit(-1);
            }
            System.out.print("입력/출력(I/O) ? ");
            String io = sc.next();
            if(io.toUpperCase().equals("O")){
                break;
            }
        }
    }
}
