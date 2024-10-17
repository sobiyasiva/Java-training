package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Load the Hibernate configuration and build the session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Open a new session
        Session session = sessionFactory.openSession();

        // Save a new Student record (Insert into the database)
        session.beginTransaction();  // Begin transaction

        Student student = new Student();
        student.setName("Jane Doe");
        student.setEmail("jane.doe@example.com");

        session.save(student);  // Save the Student object in the database
        session.getTransaction().commit();  // Commit the transaction

        // Now update the student's email
        session.beginTransaction();  // Begin new transaction

        student.setEmail("jane.updated@example.com");  // Update email
        session.update(student);  // Update the Student object in the database

        session.getTransaction().commit();  // Commit the transaction

        // Close session
        session.close();
        sessionFactory.close();
    }
}
