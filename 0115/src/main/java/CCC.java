public class CCC {
    public static void main(String[] args) {
        EEE[] e = new EEE[5];
        DDD d = new DDD();
        d.iinsert(e);
//        for(EEE ee : e){
//            System.out.println(ee.getN());
//        }
        for(int i = 0; i < e.length; i++){
            System.out.println(e[i].getN());
        }
    }
}
class DDD{
    void iinsert(EEE[] e){
        int count = 0;
        for(EEE ee : e){
            ee = new EEE(count++);
            ee.setN(count);
        }
//        for(int i = 0; i < e.length; i++){
//            e[i] = new EEE(count++);
//        }
    }
}
class EEE{
    int n;
    public EEE(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
}
