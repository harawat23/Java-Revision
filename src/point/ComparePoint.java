package point;

import java.util.Comparator;

public class ComparePoint implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2){
        double d1=Math.pow(p1.x,2)+Math.pow(p1.y,2);
        double d2=Math.pow(p2.x,2)+Math.pow(p2.y,2);

        return (int)(d1-d2);
    }
}
