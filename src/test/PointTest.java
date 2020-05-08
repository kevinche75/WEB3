package test;


import main.Point;
import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
  public void checkPoint(){
        Point point = new Point(1.3,-1.6,3.8);
        Assert.assertEquals(point.getInArea(),false);
    }

    @Test
    public  void checkPoints(){
        Point point = new Point(2d,4d,3d);
        Point point1 = new Point(1.5,3.2,3.8);
         Point point2 = new Point(0.45,2.56,3.9);
        Point point3 = new Point(2d,4.6,1.3);
        Point point4 = new Point(2.6,0.3,3.4);
        Assert.assertEquals(point.getInArea(),isInArea(point));
        Assert.assertEquals(point1.getInArea(),isInArea(point1));
        Assert.assertEquals(point2.getInArea(),isInArea(point2));
        Assert.assertEquals(point3.getInArea(),isInArea(point3));
        Assert.assertEquals(point4.getInArea(),isInArea(point4));
    }

   private   boolean isInArea(Point point){
        if (point.getX()>0&&point.getY()<0) return false;
        if(point.getX()>=0 && point.getY()>=0) return point.getX()<=point.getR() && point.getY()<=point.getR()/2;
        if(point.getX()<=0 && point.getY()<=0) return Math.pow(point.getX(), 2) + Math.pow(point.getY(),2) <= Math.pow(point.getR(), 2);
        return false;
    }

    
}
