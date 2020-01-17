public class InterfaceDemo{
    public static void main(String[] args) {
        Weekable w = new Week();
        w.set(Weekable.THU);
        System.out.println("오늘은 " + w.get() + "요일입니다.");
    }
}
