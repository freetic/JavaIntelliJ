public class ForDemo {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("별 몇층으로? : ");
        int n = sc.nextInt();
        for(int i=0; i < n; i++){
            for(int j = 0; j < n-i-1; j++) System.out.print(" ");
            for(int j = 0; j < 2*i+1; j++) System.out.print("*");
            System.out.println();
        }*/
        /*int sum = 0;
        System.out.print("얼마부터 더할까요 : "); int start = sc.nextInt();
        System.out.print("얼마까지 더할까요?"); int last = sc.nextInt();
        for(int i = start; i <= last; i++){
            sum += i;
        }
        System.out.println(start + "부터 " + last + "까지의 합은 " + sum + "입니다.");*/

        /*int count = 0;
        for(int i = 1; i <= 100; i++ ){
            if(i%7 == 0){
                System.out.print(i + "\t");
                count++;
                if(count%5 == 0) System.out.println();
            }
        }*/

        /*int count = 0;
        boolean flag = true;
        for(int i = 65; i <= 90; i++){
            if(flag) System.out.print( (char)i + "\t");
            else System.out.print( (char)(i+32) + "\t");
            count++;
            if(count%5 == 0){
                System.out.println();
                flag = !flag;
            }
        }*/
        //☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
        // x는 1부터 3씩 증가하고, y는 100부터 2씩 감소한다. x와 y가 교차될때의 x,y의 값은?
        /*int x, y;
        for(x=1, y=100; y>0; x+=3, y-=2){
            if(x > y) break;
        }
        System.out.println("x = " + x + ", y = " + y);*/

        /*for(int i = 5; i >= 1 ; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }*/

//        for(int i = 65; i <= 90; i++){
//            for(int j = 65; j<=i; j++){
//                System.out.print((char)j);
//            }
//            System.out.println();
//        }

        /*for(int i=1; i<=9; i++){
            for(int j = 2; j<=9; j++){
                System.out.printf("%d x %d = %d\t", j, i, i*j);
            }
            System.out.println();
        }*/


    }
}
