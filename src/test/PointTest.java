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
  public  PointTest(){

        points = new ArrayList<>();
        results=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/test/test.csv"))) {
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


    @Test
    public void checkPoint19(){
        Assert.assertEquals(points.get(19).getInArea(),results.get(19));
    }


    @Test
    public void checkPoint20(){
        Assert.assertEquals(points.get(20).getInArea(),results.get(20));
    }


    @Test
    public void checkPoint21(){
        Assert.assertEquals(points.get(21).getInArea(),results.get(21));
    }


    @Test
    public void checkPoint22(){
        Assert.assertEquals(points.get(22).getInArea(),results.get(22));
    }


    @Test
    public void checkPoint23(){
        Assert.assertEquals(points.get(23).getInArea(),results.get(23));
    }


    @Test
    public void checkPoint24(){
        Assert.assertEquals(points.get(24).getInArea(),results.get(24));
    }


    @Test
    public void checkPoint25(){
        Assert.assertEquals(points.get(25).getInArea(),results.get(25));
    }


    @Test
    public void checkPoint26(){
        Assert.assertEquals(points.get(26).getInArea(),results.get(26));
    }


    @Test
    public void checkPoint27(){
        Assert.assertEquals(points.get(27).getInArea(),results.get(27));
    }


    @Test
    public void checkPoint28(){
        Assert.assertEquals(points.get(28).getInArea(),results.get(28));
    }


    @Test
    public void checkPoint29(){
        Assert.assertEquals(points.get(29).getInArea(),results.get(29));
    }


    @Test
    public void checkPoint30(){
        Assert.assertEquals(points.get(30).getInArea(),results.get(30));
    }


    @Test
    public void checkPoint31(){
        Assert.assertEquals(points.get(31).getInArea(),results.get(31));
    }


    @Test
    public void checkPoint32(){
        Assert.assertEquals(points.get(32).getInArea(),results.get(32));
    }


    @Test
    public void checkPoint33(){
        Assert.assertEquals(points.get(33).getInArea(),results.get(33));
    }


    @Test
    public void checkPoint34(){
        Assert.assertEquals(points.get(34).getInArea(),results.get(34));
    }

    @Test
    public void checkPoint35(){
        Assert.assertEquals(points.get(35).getInArea(),results.get(35));
    }

    @Test
    public void checkPoint36(){
        Assert.assertEquals(points.get(36).getInArea(),results.get(36));
    }

    @Test
    public void checkPoint37(){
        Assert.assertEquals(points.get(37).getInArea(),results.get(37));
    }

    @Test
    public void checkPoint38(){
        Assert.assertEquals(points.get(38).getInArea(),results.get(38));
    }

    @Test
    public void checkPoint39(){
        Assert.assertEquals(points.get(39).getInArea(),results.get(39));
    }

    @Test
    public void checkPoint40(){
        Assert.assertEquals(points.get(40).getInArea(),results.get(40));
    }

    @Test
    public void checkPoint41(){
        Assert.assertEquals(points.get(41).getInArea(),results.get(41));
    }

    @Test
    public void checkPoint42(){
        Assert.assertEquals(points.get(42).getInArea(),results.get(42));
    }

    @Test
    public void checkPoint43(){
        Assert.assertEquals(points.get(43).getInArea(),results.get(43));
    }

    @Test
    public void checkPoint44(){
        Assert.assertEquals(points.get(44).getInArea(),results.get(44));
    }

    @Test
    public void checkPoint45(){
        Assert.assertEquals(points.get(45).getInArea(),results.get(45));
    }

    @Test
    public void checkPoint46(){
        Assert.assertEquals(points.get(46).getInArea(),results.get(46));
    }


    @Test
    public void checkPoint47(){
        Assert.assertEquals(points.get(47).getInArea(),results.get(47));
    }


    @Test
    public void checkPoint48(){
        Assert.assertEquals(points.get(48).getInArea(),results.get(48));
    }


    @Test
    public void checkPoint49(){
        Assert.assertEquals(points.get(49).getInArea(),results.get(49));
    }


    @Test
    public void checkPoint50(){
        Assert.assertEquals(points.get(50).getInArea(),results.get(50));
    }


    @Test
    public void checkPoint51(){
        Assert.assertEquals(points.get(51).getInArea(),results.get(51));
    }

    @Test
    public void checkPoint52(){
        Assert.assertEquals(points.get(52).getInArea(),results.get(52));
    }


    @Test
    public void checkPoint53(){
        Assert.assertEquals(points.get(53).getInArea(),results.get(53));
    }


    @Test
    public void checkPoint54(){
        Assert.assertEquals(points.get(54).getInArea(),results.get(54));
    }


    @Test
    public void checkPoint55(){
        Assert.assertEquals(points.get(55).getInArea(),results.get(55));
    }


    @Test
    public void checkPoint56(){
        Assert.assertEquals(points.get(56).getInArea(),results.get(56));
    }


    @Test
    public void checkPoint57(){
        Assert.assertEquals(points.get(57).getInArea(),results.get(57));
    }

    @Test
    public void checkPoint58(){
        Assert.assertEquals(points.get(58).getInArea(),results.get(58));
    }
    @Test
    public void checkPoint59(){
        Assert.assertEquals(points.get(59).getInArea(),results.get(59));
    }

    @Test
    public void checkPoint60(){
        Assert.assertEquals(points.get(60).getInArea(),results.get(60));
    }

    @Test
    public void checkPoint61(){
        Assert.assertEquals(points.get(61).getInArea(),results.get(61));
    }

    @Test
    public void checkPoint62(){
        Assert.assertEquals(points.get(62).getInArea(),results.get(62));
    }

    @Test
    public void checkPoint63(){
        Assert.assertEquals(points.get(63).getInArea(),results.get(63));
    }

    @Test
    public void checkPoint64(){
        Assert.assertEquals(points.get(64).getInArea(),results.get(64));
    }

    @Test
    public void checkPoint65(){
        Assert.assertEquals(points.get(65).getInArea(),results.get(65));
    }

    @Test
    public void checkPoint66(){
        Assert.assertEquals(points.get(66).getInArea(),results.get(66));
    }

    @Test
    public void checkPoint67(){
        Assert.assertEquals(points.get(67).getInArea(),results.get(67));
    }

    @Test
    public void checkPoint68(){
        Assert.assertEquals(points.get(68).getInArea(),results.get(68));
    }

    @Test
    public void checkPoint69(){
        Assert.assertEquals(points.get(69).getInArea(),results.get(69));
    }


}
