public class InstanceofDemo1 {
    public static void main(String[] args) {
        Sonata sonata = new Sonata("현대 소나타");
        remake(sonata);
        Carnival carnival = new Carnival("기아 카니발");
        remake(carnival);
        Matiz matiz = new Matiz("쉐보레 마티즈");
        remake(matiz);

    }
//    protected static void remake(Sonata sonata){
//        sonata.repair();
//    }
//    protected static void remake(Carnival carnival){
//        carnival.repair();
//    }
//    protected static void remake(Matiz matiz){
//        matiz.repair();
//    }
    static void remake(Car car){        // Polymorphic 파라미터
        if(car instanceof  Sonata){
            System.out.println("소나타가 수리됐습니다.");
        }
        if(car instanceof Carnival){
            System.out.println("카니발이 수리됐습니다.");
        }
        if(car instanceof  Matiz){
            System.out.println("마티즈가 수리됐습니다.");
        }
    }

}
