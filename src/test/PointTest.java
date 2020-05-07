package test;

import main.Point;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
  public   void getA(){
        Point point1 = new Point(1,2,3);
        Point point2 = new Point(2,7,4);
        Assert.assertEquals(point1,point2);
    }
}
