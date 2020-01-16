import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }
    public Product input(){
        System.out.print("상품명 : ");
        String name = sc.next();
        System.out.print("수량 : ");
        int qty = sc.nextInt();
        System.out.print("판매단가 : ");
        int salemoney = sc.nextInt();
        System.out.print("매입단가 : ");
        int buymoney = sc.nextInt();
        System.out.print("운송료 : ");
        int fee = sc.nextInt();
        Product p = new Product(name, qty, salemoney, buymoney, fee);
        return p;
    }
}
