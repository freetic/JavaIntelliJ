import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];
        Main main = new Main();
        main.input(friends);
    }
    public void input(Friend[] friends){
        int count = 0;
        while(true){
            int choice = menu();
            switch(choice){
                case 1:
                    insert(friends, count++);
                    break;
                case 2:
                    search(friends, count);
                    break;
                case 3:
                    catalog(friends, count);
                    break;
                default:
                    System.out.println("잘못눌렀다");
                    System.exit(-1);
            }
            if(count == 10){
                System.out.println("가득 찼습니다.");
                System.exit(-1);
            }
        }
    }

    private void insert(Friend[] friends, int count){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름 : ");
//        String name = sc.next();
//        System.out.println("전화번호 : ");
//        String phoneNumber = sc.next();
//        System.out.println("관계 : ");
//        String relation = sc.next();
//        sc.close();
//        friends[count] = new Friend(name, phoneNumber, relation);
    }

    private void search(Friend[] friends, int count){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i = 0; i < count; i ++){
            if(name.equals(friends[i])) System.out.println(friends[i].toString());
        }
    }
    private void catalog(Friend[] friends, int count){
        for(int i = 0; i < count; i++){
            System.out.println(friends[i].toString());
        }
    }

    private int menu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n = 1;
        do{
            flag = false;
            System.out.println("1. 추가");
            System.out.println("2. 검색");
            System.out.println("3. 목록보기");
            n = sc.nextInt();
            if(n < 1 || n > 3) flag = true;
        } while(flag);
        sc.close();
        return n;
    }
}
