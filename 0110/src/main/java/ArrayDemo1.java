public class ArrayDemo1 {
    public static void main(String[] args) {
        /*for(int i = 0; i < args.length; i++){
            System.out.println("Array[" + i + "] = " + args[i]);
        }*/

        if(args.length != 4){
            System.out.println("잘못 입력하셨습니다.");
            System.exit(-1);
        }
        String firstStr = args[0];
        int first = Integer.parseInt(firstStr);
        String op = args[1];
        String secondStr = args[2];
        int second = Integer.parseInt(secondStr);
        switch(op){
            case "+": System.out.println("정답 : " + (first+second) ); break;
            case "-": System.out.println("정답 : " + (first-second)); break;
            case "x": System.out.println("정답 : " + (first*second)); break;
            case "/": System.out.println("정답 : " + (first/second)); break;
            case "%": System.out.println("정답 : " + (first%second)); break;
            default: System.out.println("잘못 입력하셨습니다.");
        }
    }
}
