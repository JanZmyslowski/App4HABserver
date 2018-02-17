package pl.edu.pwr.aerospace.app4hab.server.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Db {
    private static SessionFactory sessionFactory;

    static Session getSession(){
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



//
//
//        s = sessionFactory.openSession();
//        Criteria c = s.createCriteria(PhoneActivity.class);
//        return c.list();
}
