public class Phone {
    private int side;
    private String phoneNum;
    private String name;
    private int using;
    private int minimumCharge;
    private int usedCharge;
    private int tax;
    private int total;

    public Phone(int side, String phoneNum, String name, int using) {
        this.side = side;
        this.phoneNum = phoneNum;
        this.name = name;
        this.using = using;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsing() {
        return using;
    }

    public void setUsing(int using) {
        this.using = using;
    }

    public int getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(int minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public int getUsedCharge() {
        return usedCharge;
    }

    public void setUsedCharge(int usedCharge) {
        this.usedCharge = usedCharge;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
