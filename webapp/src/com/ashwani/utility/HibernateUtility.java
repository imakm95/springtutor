package com.ashwani.utility;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


 
public class HibernateUtility {
 
    private static SessionFactory sessionFactory = null;
 
    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }
    }
 
    public static void loadSessionFactory(){
    	File hibernatePropsFile = new File("A://Eclipse-1//webapp/WebContent//WEB-INF/hibernate.cfg.xml");
        Configuration configuration = new Configuration();
        configuration.configure(hibernatePropsFile);
        configuration.addAnnotatedClass(com.ashwani.entity.EmployeeEntity.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

//        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }
 
    public static Session getSession() throws HibernateException {
 
        Session retSession=null;
            try {
                retSession = sessionFactory.openSession();
            }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
            }
            if(retSession == null) {
                System.err.println("session is discovered null");
            }
 
            return retSession;
    }
}