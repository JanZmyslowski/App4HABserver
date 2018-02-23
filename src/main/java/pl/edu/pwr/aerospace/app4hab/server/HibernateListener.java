package pl.edu.pwr.aerospace.app4hab.server;

import pl.edu.pwr.aerospace.app4hab.server.daos.Db;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        Db.getSessionFactory();
    }

    public void contextDestroyed(ServletContextEvent event) {
        Db.getSessionFactory().close();
    }
}