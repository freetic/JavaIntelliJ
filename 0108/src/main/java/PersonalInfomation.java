import java.util.Calendar;
import java.util.Scanner;


public class PersonalInfomation {
    public static void main(String[] args) {
        String[] arr = new String[]{"원숭이", "닭", "개", "돼지", "쥐",
                "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        String name = sc.next();
        int bornYear = sc.nextInt();
        int age = cal.getWeekYear() - WbornYear+ 1;
        String zodiacSign="";
        System.out.println(1991%12);

        Calendar.getInstance().getWeekYear();
    // 10 = 말 , 11= 양
//        switch(bornYear%12){
//            case 10: zodiacSign = "말"; break;
//            case 11: zodiacSign = "양"; break;
//            case 0: zodiacSign = "원숭이"; break;
//            case 1: zodiacSign = "닭"; break;
//            case 2: zodiacSign = "개"; break;
//            case 3: zodiacSign = "돼지"; break;
//            case 4: zodiacSign = "쥐"; break;
//            case 5: zodiacSign = "소"; break;
//            case 6: zodiacSign = "호랑이"; break;
//            case 7: zodiacSign = "토끼"; break;
//            case 8: zodiacSign = "용"; break;
//            case 9: zodiacSign = "뱀"; break;
//            default: zodiacSign= "알 수 없다.";
//        }
        for(int i = 0; i < 12; i++){
            if(bornYear%12 == i){
                zodiacSign = arr[i];
            }
        }

        System.out.printf("%s님(%d세)은 %s띠입니다.", name, age, zodiacSign);
    }
}
