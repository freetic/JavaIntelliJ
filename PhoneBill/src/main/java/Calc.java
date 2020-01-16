public class Calc {
    private Phone[] array;

    public Calc(Phone[] array) {
        this.array = array;
    }

    public void calc() {
        for(int i = 0; i < array.length; i++){
            switch (array[i].getSide()){
                case 1:array[i].setMinimumCharge(6000); break;
                case 2:array[i].setMinimumCharge(4800); break;
                case 3:array[i].setMinimumCharge(3000); break;
                default:
                    System.out.println("구분이 잘못 입력됨.");
                    System.exit(-1);
            }
            array[i].setUsedCharge(12*array[i].getUsing());
            int tax = (array[i].getMinimumCharge() + array[i].getUsedCharge())/10;
            array[i].setTax(tax);
            array[i].setTotal(array[i].getMinimumCharge() + array[i].getUsedCharge() + tax);
        }
    }
}