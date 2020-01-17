import java.util.Scanner;

public class Input {
    Friend[] friends;

    public Input(Friend[] friends) {
        this.friends = friends;
    }

    public void input(){
        int count = 0;
        while(true){
            int choice = menu();
            switch(choice){
                case 1:
                    insert(count);
                    count++;
                    break;
                case 2:
                    search(count);
                    break;
                case 3:
                    catalog(count);
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

    private void insert(int count){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("전화번호 : ");
        String phoneNumber = sc.next();
        System.out.println("관계 : ");
        String relation = sc.next();
        friends[count] = new Friend(name, phoneNumber, relation);
    }

    private void search(int count){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i = 0; i < count; i ++){
            if(name.equals(friends[i])) System.out.println(friends[i].toString());
        }
    }
    private void catalog(int count){
        for(int i = 0; i < count; i++){
            System.out.println(friends[i].toString());
        }
    }

    private static int menu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n = 0;
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
