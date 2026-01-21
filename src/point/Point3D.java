package point;

import java.io.Serializable;

public class Point3D extends Point implements Serializable {
    public int z;
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    @Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }

        if (getClass()==o.getClass()){
            Point3D p1=(Point3D) o;
            return (this.x==p1.x && this.y==p1.y && this.z==p1.z);
        }

        return false;
    }
}