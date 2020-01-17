public class Student implements IPerson {
    private String hakbun;
    private int score;

    public Student() {
    }

    public Student(String hakbun, int score) {
        this.hakbun = hakbun;
        this.score = score;
    }

//    public Student(String name, int age, String address, String hakbun, int score) {
//        super(name, age, address);
//        this.hakbun = hakbun;
//        this.score = score;
//    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

//    @Override
//    public String toString() {
//        return  String.format("이름:%s, 나이:%d, 주소:%s, 학번:%s, 점수:%d", this.getName(),
//                this.getAge(), this.getAddress(), this.getHakbun(), this.getScore());
//    }

    @Override
    public void printInfo() {
        System.out.println("학번 = " + hakbun + ", 점수 = " + score);
    }
}
