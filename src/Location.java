import point.ComparePoint;
import point.Point;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Location implements Cloneable, Serializable {
    public ArrayList<Point> arr=new ArrayList<>();

    public Location(Point ...l){
        arr.addAll(Arrays.asList(l));
    }

    public Location(ArrayList<Point> arr){
        this.arr.addAll(arr);
    }

    @Override
    public Location clone() throws CloneNotSupportedException {
        Location location = (Location) super.clone();
        return new Location(this.arr);
    }

    @Override
    public boolean equals(Object L){
        if (L==null){
            return false;
        }

        if (getClass()!=L.getClass()){
            return false;
        }

        Location l=(Location) L;

        if (this.arr.size()!=l.arr.size()){
            return false;
        }
        this.arr.sort(new ComparePoint());
        l.arr.sort(new ComparePoint());

        for (int i=0;i<l.arr.size();i++){
            if (l.arr.get(i) != this.arr.get(i)){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString(){
        return this.arr.toString();
    }
}
