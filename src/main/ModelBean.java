package main;

import main.HibernateUtil;
import org.hibernate.Session;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "modelBean", eager = true)
@ApplicationScoped
public class ModelBean {

    private String rawX;
    private String rawY;
    private String rawR;
    private List<Point> list = new ArrayList<>();

    public String getRawX() {
        return rawX;
    }

    public void setRawX(String rawX) {
        this.rawX = rawX;
    }

    public String getRawY() {
        return rawY;
    }

    public void setRawY(String rawY) {
        this.rawY = rawY;
    }

    public String getRawR() {
        return rawR;
    }

    public void setRawR(String rawR) {
        this.rawR = rawR;
    }

    public void addToList() {
        System.out.println(rawX + ' ' + rawY + ' ' + rawR);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Point point = new Point(Double.parseDouble(rawX.replace(',', '.').trim()),
                    Double.parseDouble(rawY.replace(',', '.').trim()),
                    Double.parseDouble(rawR.replace(',', '.').trim()));
            session.save(point);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ошибка парсинга");
        }
    }

    public List<Point> getList() {
        List<Point> list = null;
            try(Session session = HibernateUtil.getSessionFactory().openSession()){
                session.beginTransaction();
                list =  (List<Point>)session.createQuery("From Point").list();
            } catch (Exception e){
                e.printStackTrace();
            }
            return list;
    }
}
