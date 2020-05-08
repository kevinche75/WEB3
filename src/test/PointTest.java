package test;


import main.Point;
import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
  public void getA(){
        Point point = new Point(1.3,-1.6,3.8);
//        Point point1 = new Point(1.3,1.6,3.8);
//        Point point2 = new Point(1d,7d,4d);
        Assert.assertEquals(point.getInArea(),false);
//        Assert.assertNull(point);
    }
}
