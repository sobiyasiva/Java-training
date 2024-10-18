package com.example.demo.Criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeConditions {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException | ExceptionInInitializerError ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        EmployeeConditions EC = new EmployeeConditions();
        EC.getEmployeesByEachCondition();
    }

    public void getEmployeesByEachCondition() {
        try (Session session = factory.openSession()) {
    
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
            Root<Employee> root = query.from(Employee.class);
            Predicate inCondition = root.get("salary").in(2000, 5000);
            query.select(root).where(inCondition);
            List<Employee> inConditionEmployees = session.createQuery(query).getResultList();
            System.out.println("Employees matching IN condition (salary in 2000, 5000):");
            printEmployees(inConditionEmployees);

            query = builder.createQuery(Employee.class); 
            root = query.from(Employee.class); 
            Predicate andCondition = builder.and(
                    builder.between(root.get("salary"), 3000, 5000),
                    builder.like(root.get("lastName"), "P%")
            );
            query.select(root).where(andCondition);
            List<Employee> andConditionEmployees = session.createQuery(query).getResultList();
            System.out.println("Employees matching AND condition (salary between 3000 and 5000 AND last name starts with 'P'):");
            printEmployees(andConditionEmployees);
    

            query = builder.createQuery(Employee.class); 
            root = query.from(Employee.class); 
            Predicate orCondition = builder.or(
                    builder.equal(root.get("firstName"), "Zara"),
                    builder.equal(root.get("salary"), 3000)
            );
            query.select(root).where(orCondition);
            List<Employee> orConditionEmployees = session.createQuery(query).getResultList();
            System.out.println("Employees matching OR condition (first name is 'Zara' OR salary is 3000):");
            printEmployees(orConditionEmployees);
            query = builder.createQuery(Employee.class); 
            root = query.from(Employee.class); 
            Predicate finalCondition = builder.and(inCondition, andCondition, orCondition);
            query.select(root).where(finalCondition);
            List<Employee> finalEmployees = session.createQuery(query).getResultList();
            System.out.println("Employees matching combined conditions (IN, AND, OR):");
            printEmployees(finalEmployees);
    
        } catch (Exception e) {
            System.err.println("Error while retrieving employees by conditions: " + e.getMessage());
        }
    }
    

    private void printEmployees(List<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", Salary: " + emp.getSalary());
            }
        }
    }
}
