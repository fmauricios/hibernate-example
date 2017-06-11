package me.mauricioserna.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by mauricio on 11/06/17.
 */
public class JavaApiSession {

    private Session session;

    public JavaApiSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    public Session getSession() {
        return session;
    }
}
