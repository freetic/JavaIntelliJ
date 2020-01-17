import javax.swing.JOptionPane;
import java.util.Scanner;

public class PolymophismDemo1 {
    public static void main(String[] args) {
        PolymophismDemo1 pd = new PolymophismDemo1();
        int choice = 0;
        while (true) {
            pd.showMenu();
            choice = pd.input();
            if(choice == 5) break;
            else if(choice > 5 || choice < 1){
                JOptionPane.showMessageDialog(null, "잘못된 입력값입니다.");
                System.out.println("잘못된 입력값이다!");
                continue;
            }else{
                pd.output(choice);
            }
        }
    }
    void showMenu(){
        System.out.println("***Menu***");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Korean");
        System.out.println("4. American");
        System.out.println("5. Exit");
    }
    int input(){
        Object sc = new Scanner(System.in);
        System.out.print("어느 종족 ? : ");
        int choice = ((Scanner) sc).nextInt();
        return choice;
    }
    void output(int choice){
        Mammal m = null;
        switch (choice){
            case 1: m = new Dog(); break;
            case 2: m = new Cat(); break;
            case 3: m = new Korean(); break;
            case 4: m = new American(); break;
        }
        m.saySomething();
    }
}
