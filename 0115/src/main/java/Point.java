public class Point {
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }
    @Override
    public String toString(){
        return "(x, y) = (" + this.x + ", " + this.y + ")";
    }
    @Override
    public boolean equals(Object obj){
        Point child = (Point)obj;
        if(this.x == child.x && this.y == child.y)
            return true;
        else return false;
    }
}
