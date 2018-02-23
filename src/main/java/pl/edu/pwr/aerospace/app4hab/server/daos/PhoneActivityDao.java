package pl.edu.pwr.aerospace.app4hab.server.daos;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import pl.edu.pwr.aerospace.app4hab.server.entities.PhoneActivity;

import java.util.List;

public class PhoneActivityDao extends Dao {

    public PhoneActivity getLastActivity(){
        Session s = Db.getSession();
        Transaction tx = s.beginTransaction();
        Criteria c = s.createCriteria(PhoneActivity.class);
        c.addOrder(Order.desc("ID"));
        return (PhoneActivity)c.list().get(0);
    }

    public List<PhoneActivity> getAllActivities(){
        Session s = Db.getSession();
        Transaction tx = s.beginTransaction();
        Criteria c = s.createCriteria(PhoneActivity.class);
        return c.list();
    }
}
