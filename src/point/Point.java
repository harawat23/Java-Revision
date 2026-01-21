package point;

import java.io.Serializable;

public class Point implements Comparable<Point>, Serializable {
    public int x;
    public int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    /*@Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }

        if (o instanceof point.Point){
            point.Point p1=(point.Point) o;
            return ((p1.x==this.x) && (p1.y==this.y));
        }

        return false;
    }*/ // this will work fine only if the object if of point class , if we add point.Point3D it will end up giving wrong answer

    @Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }

        if (getClass()==o.getClass()){
            Point p1=(Point) o;
            return (this.x==p1.x && this.y==p1.y);
        }

        return false;
    }

    @Override
    public int compareTo(Point p1){ // compare distance from origin
        double dist=Math.pow(Math.pow(p1.x,2)+Math.pow(p1.y,2),0.5);
        double dist1=Math.pow(Math.pow(this.x,2)+Math.pow(this.y,2),0.5);

        return Double.compare(dist1, dist);
    }

    @Override
    public String toString(){
        return "( "+this.x+" , "+this.y+" )";
    }
}