package main;

import javax.persistence.*;
import java.util.Objects;

//mdasdlnas

@Entity
@Table

public class Point{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private Double r;
    @Column(nullable = false)
    private Double x;
    @Column(nullable = false)
    private Double y;
    @Column(nullable = false)
    private Boolean isInArea;

    public Point(Double x, Double y, Double r){
        this.x = x;
        this.y = y;
        this.r = r;
        setIsArea();
    }

    public Point(Double r, Double x, Double y, Boolean isInArea) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.isInArea = isInArea;
    }

    public Point() {
    }

    public void setR(Double r) {
        this.r = r;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setInArea(Boolean inArea) {
        isInArea = inArea;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getR() {
        return r;
    }

    public Boolean getInArea() {
        return isInArea;
    }

    private void setIsArea() {
        if(x > 0 && y < 0){
            isInArea = false;
            return;
        }
        if(x>=0 && y>=0){
            isInArea = x<=r && y<=r/2;
            return;
        }
        if(x<0 && y>=0){
            isInArea = y <= x/2 + r/2;
            return;
        }
        if(x<=0 && y<=0){
            isInArea = Math.pow(x, 2) + Math.pow(y,2) <= Math.pow(r, 2);
            return;
        }
        isInArea = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(r, point.r) &&
                Objects.equals(x, point.x) &&
                Objects.equals(y, point.y) &&
                Objects.equals(isInArea, point.isInArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, x, y, isInArea);
    }
}