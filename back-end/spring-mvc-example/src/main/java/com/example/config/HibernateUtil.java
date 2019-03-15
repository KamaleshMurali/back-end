/**
 * 
 */
package com.example.config;

import java.util.Properties;

//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

import com.example.model.User;

/**
 * @author kamalesh.murali
 * @since Mar 12, 2019
 */
public class HibernateUtil {

//    private static SessionFactory sessionFactory;
//
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            sessionFactory = buildSessionFactory();
//        }
//        return sessionFactory;
//    }
//
//    private static SessionFactory buildSessionFactory() {
//
//        Configuration config = new Configuration();
//
//        Properties properties = new Properties();
//        properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//        properties.put("hibernate.connection.url", "jdbc:mysql://192.168.20.170/TestDB");
//        properties.put("hibernate.connection.username", "root");
//        properties.put("hibernate.connection.password", "root");
//        properties.put("hibernate.current_session_context_class", "thread");
//        config.setProperties(properties);
//
//        config.addAnnotatedClass(User.class);
//        
//        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
//        
//        return sessionFactory;
//        
//    }
}
