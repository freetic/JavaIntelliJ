import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        MethodDemo3 md3 = new MethodDemo3();
        int selected = md3.showMenu();

        switch(selected){
            case 1: md3.add(5, 9); break;
            case 2: md3.subtract(5, 9); break;
            case 3: md3.multiply(5, 9); break;
            case 4: md3.divide(5, 9); break;
            case 5: md3.modules(5, 9); break;
        }
    }

    int showMenu(){
        System.out.println("************쌍용 메뉴판************");
        System.out.println("1 : 더하기");
        System.out.println("2 : 빼기");
        System.out.println("3 : 곱하기");
        System.out.println("4 : 나누기");
        System.out.println("5 : 나머지");
        Scanner sc = new Scanner(System.in);
        System.out.println("번호 선택 : ");
        return sc.nextInt();
    }
    void add(int a, int b){
        System.out.println("Called By add() : " + (a+b));
    }
    void subtract(int a, int b){
        System.out.println("Called By subtract() : " + (a-b));
    }
    void multiply(int a, int b){
        System.out.println("Called By multiply() : " + (a-b));
    }
    void divide(int a, int b){
        System.out.println("Called By divide() : " + (a/b));
    }
    void modules(int a, int b){
        System.out.println("Called By modules() : " + (a%b));
    }
}
