package com.example.demo.Criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {

    private static SessionFactory factory;
    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void main(String[] args) {
        ManageEmployee ME = new ManageEmployee();

        Integer empID1 = ME.addEmployee("Zara", "Ali", 2000);
        Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
        Integer empID3 = ME.addEmployee("John", "Paul", 5000);
        Integer empID4 = ME.addEmployee("Mohd", "Yasee", 3000);

        System.out.println("Employee IDs: " + empID1 + ", " + empID2 + ", " + empID3 + ", " + empID4);


        Employee employee = ME.getEmployeeById(empID2);
        if (employee != null) {
            System.out.println("Selected Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", Salary: " + employee.getSalary());
        } else {
            System.out.println("Employee not found with ID: " + empID2);
        }

        List<Employee> employees = ME.getAllEmployees();
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", Salary: " + emp.getSalary());
        }


        Employee uniqueEmployee = ME.getUniqueEmployeeBySalary(5000);
        if (uniqueEmployee != null) {
            System.out.println("Unique Employee with Salary 5000: " + uniqueEmployee.getFirstName() + " " + uniqueEmployee.getLastName());
        } else {
            System.out.println("No employee found with the specified salary.");
        }
    }


    public Integer addEmployee(String fname, String lname, int salary) {
        Integer employeeID = null;
        Transaction tx = null;

        try (Session session = factory.openSession()) {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            System.err.println("Error while adding employee: " + e.getMessage());
        }
        return employeeID;
    }


    public Employee getEmployeeById(Integer employeeID) {
        Employee employee = null;

        try (Session session = factory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
            Root<Employee> root = query.from(Employee.class);
            query.select(root).where(builder.equal(root.get("id"), employeeID));

            employee = session.createQuery(query).uniqueResult();
        } catch (HibernateException e) {
            System.err.println("Error while retrieving employee by ID: " + e.getMessage());
        }
        return employee;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = null;
        try (Session session = factory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
            query.from(Employee.class);

            employees = session.createQuery(query).getResultList();
        } catch (HibernateException e) {
            System.err.println("Error while retrieving all employees: " + e.getMessage());
        }
        return employees;
    }

    public Employee getUniqueEmployeeBySalary(int salary) {
        Employee employee = null;
        try (Session session = factory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
            Root<Employee> root = query.from(Employee.class);
            query.select(root).where(builder.equal(root.get("salary"), salary));

            employee = session.createQuery(query).uniqueResult();
        } catch (HibernateException e) {
            System.err.println("Error while retrieving employee by salary: " + e.getMessage());
        }
        return employee;
    }
}
