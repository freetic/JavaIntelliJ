public class Week implements Weekable {
    private int date = 0;
    @Override
    public void set(int date) {
        this.date = date;
    }

    @Override
    public int get() {
        return this.date;
    }
}
