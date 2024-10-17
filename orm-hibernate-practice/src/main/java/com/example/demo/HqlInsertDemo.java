
package com.example.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HqlInsertDemo {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            User user = new User("john_doe", "john@example.com");
            session.save(user); 

            tx.commit(); 
            System.out.println("User inserted: " + user);
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
