import point.ComparePoint;
import point.Location;
import point.Point;
import point.Point3D;

import java.io.*;
import java.time.*;
import java.util.*;

/*
* Implementation of methods like compareTo, compare, toString and equals.
* Equals method is used to highlight some issue
* */
public class Main {
    public static void main(String[] args) {
        Point p= new Point(3,5);
        Point p1=new Point(2,5);
        Point3D p2=new Point3D(3,5,2);
        Point3D p3=new Point3D(3,5,2);
        Point p4=new Point(3,5);

        System.out.println(p.equals(p1));
        System.out.println(p.equals(p4));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p4));

        System.out.println(p.equals(p3));
        System.out.println(p3.equals(p));

        List<Point> L= new ArrayList<>(List.of(new Point[]{p1, p, new Point(4, 5), new Point(7, 8), new Point(9, 10)}));

        L.sort(new ComparePoint());

        System.out.println(L);

        Location l= new Location(p,p1,p4);
        try {
            Location l1 = l.clone();

            System.out.println(l == l1);
            System.out.println(l.equals(l1)); // l and l1 are not same objects but they have same value
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        ObjectOutputStream o=null;
        ObjectInputStream i=null;

        try{
            o=new ObjectOutputStream(new FileOutputStream("location.txt"));
            o.writeObject(l);

            i=new ObjectInputStream(new FileInputStream("location.txt"));
            System.out.println((Location)i.readObject());
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}