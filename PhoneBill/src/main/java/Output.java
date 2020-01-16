public class Output {
    private Phone[] array;
    public Output(Phone[] array){
        this.array = array;
    }
    public void output() {
        printLabel();
        System.out.print(this.array[0].getName());
        for(Phone phone : array){
            System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d",
                    phone.getSide(), phone.getPhoneNum(), phone.getName(),
                    phone.getMinimumCharge(), phone.getUsedCharge(),
                    phone.getTax(), phone.getTotal());
        }
    }
    private static void printLabel(){
        System.out.println("<< 1월 전화 요금 명세서>>");
        System.out.println("================================================");
        System.out.println("구분  전화번호  이름   기본요금 통화료   세금   합계");
        System.out.println("--------------------------------------------------------------------------------");
    }
}
