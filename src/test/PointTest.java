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
    public  void checkRandomPoint(){
        Point point = new Point(Math.random()*8-5,Math.random()*10-5,Math.random()*5);
        boolean isInArea = false;

        if(point.getX()>=0 && point.getY()>=0)
            isInArea = point.getX()<=point.getR() && point.getY()<=point.getR()/2;

        if(point.getX()<0 && point.getY()>=0)
            isInArea = point.getY() <= point.getX()/2 + point.getR()/2;

        if(point.getX()<=0 && point.getY()<=0)
            isInArea = Math.pow(point.getX(), 2) + Math.pow(point.getY(),2) <= Math.pow(point.getR(), 2);

        Assert.assertEquals(point.getInArea(),isInArea);
    }




    
}
