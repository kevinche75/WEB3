package test;


import main.Point;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PointTest {
   private List<Point> points;
    private List<Boolean> results;
  public   PointTest(){

        points = new ArrayList<>();
        results=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("F:\\msp\\WEB3\\src\\test\\test.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[]values = line.split("\t");
                points.add(new Point(Double.parseDouble(values[0]),Double.parseDouble(values[1]),Double.parseDouble(values[2])));
                results.add(Boolean.parseBoolean(values[3]));

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void checkPoint0(){
        Assert.assertEquals(points.get(0).getInArea(),results.get(0));
    }


    @Test
    public void checkPoint1(){
        Assert.assertEquals(points.get(1).getInArea(),results.get(1));
    }


    @Test
    public void checkPoint2(){
        Assert.assertEquals(points.get(2).getInArea(),results.get(2));
    }


    @Test
    public void checkPoint3(){
        Assert.assertEquals(points.get(3).getInArea(),results.get(3));
    }


    @Test
    public void checkPoint4(){
        Assert.assertEquals(points.get(4).getInArea(),results.get(4));
    }


    @Test
    public void checkPoint5(){
        Assert.assertEquals(points.get(5).getInArea(),results.get(5));
    }


    @Test
    public void checkPoint6(){
        Assert.assertEquals(points.get(6).getInArea(),results.get(6));
    }


    @Test
    public void checkPoint7(){
        Assert.assertEquals(points.get(7).getInArea(),results.get(7));
    }


    @Test
    public void checkPoint8(){
        Assert.assertEquals(points.get(8).getInArea(),results.get(8));
    }


    @Test
    public void checkPoint9(){
        Assert.assertEquals(points.get(9).getInArea(),results.get(9));
    }


    @Test
    public void checkPoint10(){
        Assert.assertEquals(points.get(10).getInArea(),results.get(10));
    }


    @Test
    public void checkPoint11(){
        Assert.assertEquals(points.get(11).getInArea(),results.get(11));
    }


    @Test
    public void checkPoint12(){
        Assert.assertEquals(points.get(12).getInArea(),results.get(12));
    }


    @Test
    public void checkPoint13(){
        Assert.assertEquals(points.get(13).getInArea(),results.get(13));
    }


    @Test
    public void checkPoint14(){
        Assert.assertEquals(points.get(14).getInArea(),results.get(14));
    }


    @Test
    public void checkPoint15(){
        Assert.assertEquals(points.get(15).getInArea(),results.get(15));
    }


    @Test
    public void checkPoint16(){
        Assert.assertEquals(points.get(16).getInArea(),results.get(16));
    }


    @Test
    public void checkPoint17(){
        Assert.assertEquals(points.get(17).getInArea(),results.get(17));
    }


    @Test
    public void checkPoint18(){
        Assert.assertEquals(points.get(18).getInArea(),results.get(18));
    }





}
