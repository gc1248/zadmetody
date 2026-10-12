public class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
}
