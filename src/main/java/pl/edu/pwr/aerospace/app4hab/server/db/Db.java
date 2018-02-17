package pl.edu.pwr.aerospace.app4hab.server.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Db {
    private static SessionFactory sessionFactory;

    public static Session getSession(){
        if (sessionFactory == null) initSessionFactory();

        return sessionFactory.openSession();
    }


    private static void initSessionFactory() {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }


//        Session s = sessionFactory.openSession();
//        s.beginTransaction();
//        s.save(a);
//        s.getTransaction().commit();
//        s.close();
//
//
//        s = sessionFactory.openSession();
//        Criteria c = s.createCriteria(PhoneActivity.class);
//        return c.list();
}
