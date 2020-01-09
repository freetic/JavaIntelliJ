import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하시는 계절 : ");
        String season = sc.next();
        System.out.println("season = " + season);
//        if(season.equals("spring")){
//            System.out.println("개나리, 진달래");
//        } else if(season.equals("summer")){
//            System.out.println("장미, 아카시아");
//        } else if(season.equals("fall")){
//            System.out.println("코스모스, 백합");
//        } else{
//            System.out.println("동백, 매화");
//        }
        switch(season){
            case "spring":
                System.out.println("r개나리, 진달래");
                break;
            case "summer":
                System.out.println("장미, 아카시아");
                break;
            case "fall":
                System.out.println("코스모스");
                break;
            case "winter":
                System.out.println("동백");
                break;
        }
    }
}
