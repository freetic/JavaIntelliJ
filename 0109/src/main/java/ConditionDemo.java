import javax.swing.*;

public class ConditionDemo {
    public static void main(String[] args) {
        int first = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자 입력 : "));
        int second = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자 입력 : "));
        String op = JOptionPane.showInputDialog("연산자(+, -, x, /, %) : ");
        switch(op){
            case "+": JOptionPane.showMessageDialog(null, (first + second) + " 입니다."); break;
            case "-": JOptionPane.showMessageDialog(null, (first - second) + " 입니다."); break;
            case "x": JOptionPane.showMessageDialog(null, (first * second) + " 입니다."); break;
            case "/": JOptionPane.showMessageDialog(null, (first / second) + " 입니다."); break;
            case "%": JOptionPane.showMessageDialog(null, (first % second) + " 입니다."); break;
            default: JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
        }
    }
}
                            