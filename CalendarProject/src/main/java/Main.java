import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 년, 몇 월 ? : ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        display(getWeekDay(year, month), getMaxDay(year, month));
    }
    static void display(int space, int maxday){
//        첫 줄...
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("---------------------------------");
        int count = 0;
        for(int i = 0; i < space; i++){
            System.out.print("★\t");
            count++;
        }
        for(int i = 1; i <= maxday; i++){
            System.out.print(i + "\t");
            count++;
            if(count % 7 == 0){
                System.out.println();
                count=0;n
            }
        }
    }
    static int getWeekDay(int year, int month){
//        1. 총 날 수 계산하기.
        int sum = 0;
        for(int i = 1; i < year; i++){
            if(isLeapYear(i)) sum+=366;
            else sum += 365;
        }
        for(int i = 1; i < month; i++) sum += getMaxDay(year, i);
        sum++;
        return sum % 7;
    }

    static int getMaxDay(int year, int month){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2:
                if(isLeapYear(year)) return 29;
                else return 28;
            default: return 0; // 에러
        }

    }
    static boolean isLeapYear(int year){
//        Parameter로 들어온 연도가 윤년이면 true, 아니면 false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
