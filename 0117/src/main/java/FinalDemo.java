public class FinalDemo {
    private final int NUM;          // 멤버 상수
    public static final int ENG = 90;  // 클래스 상수
    public static void main(String[] args) {
        final int SU = 5;       // 지역 상수

    }

    public FinalDemo(int NUM) {
        this.NUM = NUM;
    }

    static void change(final int su){
//        su += 100;      // 에러 발생(변경 불가)
    }
}
