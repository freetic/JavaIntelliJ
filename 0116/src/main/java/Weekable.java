//1. interface에는 변수를 가질 수 없다. 상수만 멤버 가능하다.
//2. interface에 상수는 반드시 public static이어야 한다.(모든 변수가 이러므로, public static final은 생략한다.)

public interface Weekable {
    int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;
    void set(int date);
    int get();
}
