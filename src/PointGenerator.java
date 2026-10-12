import java.util.ArrayList;
import java.util.Random;

public class PointGenerator {
    ArrayList<MyPoint> points = new ArrayList<>();
    Random random = new Random();

    public void genericPoints() {
        for(int i = 0; i < 100; i++) {
            int x = random.nextInt(201) - 100;
            int y = random.nextInt(201) - 100;
            points.add(new MyPoint(x, y));
        }
    }

    public void show() {
        for(int i = 0; i < points.size(); i++){
            System.out.println("Punkt o współrzędnych");
            System.out.println("x = " + points.get(i).getX());
            System.out.println("y = " + points.get(i).getY());
            System.out.println("Odległość od środka układu współrzędnych = " + points.get(i).distance());
        }
    }

}
