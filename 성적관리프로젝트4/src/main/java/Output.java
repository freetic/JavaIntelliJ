public class Output {
    private Student[] array;
    public Output(Student[] array){
        this.array = array;
    }
    public void output(){
        this.printLabel();
        for(Student s : this.array){
//            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\n", s.getHakbun(),
//                    s.getName(), s.getKor(), s.getEng(), s.getMat(),
//                    s.getTot(), s.getAvg(), s.getGrade());
            System.out.println(s);
        }
    }
    private void printLabel(){
        System.out.println("  <<싸용고등학교 성적관리 프로그램>>");
        System.out.println("학번 이름 국어 영어 수학 총점 평균 평점");
        System.out.println("---------------------------------------");
    }
}
