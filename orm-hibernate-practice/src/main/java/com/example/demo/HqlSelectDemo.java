
package com.example.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HqlSelectDemo {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<User> query = session.createQuery("from User", User.class);
            List<User> users = query.getResultList();

            for (User user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            printStackTrace(e);
        }
    }
    public static void printStackTrace(Throwable throwable) {
        System.err.println(throwable.toString()); 
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.err.println("\tat " + element); 
        }
    }
}
