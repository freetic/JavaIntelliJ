public class Calc {
    private Product p;

    public Calc(Product p){
        this.p = p;
    }

    public void calc(){
        int sale = p.getQty() * p.getSalemoney();
        int buy = p.getQty() * p.getBuymoney();
        int total = sale - (buy + p.getFee());
        double rate = 1.0*total/buy*100;
        p.setTotal(total);
        p.setRate(rate);
    }
}
