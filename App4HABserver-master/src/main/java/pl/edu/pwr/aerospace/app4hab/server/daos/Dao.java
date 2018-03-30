package pl.edu.pwr.aerospace.app4hab.server.daos;

import org.hibernate.Session;

public abstract class Dao {

    public void save(Object o){
        Session s = Db.getSession();
        s.beginTransaction();
        s.save(o);
        s.getTransaction().commit();
    }
}
