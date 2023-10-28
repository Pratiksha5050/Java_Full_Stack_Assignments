//Use a HashSet to hold Employee Objects. Upon running the application, the details of the 
// e added to the HashSet should be displayed. 
// Employee <<class>> 
//  |-- id 
//  |-- name 
//  |-- salary 
//  |-- department 
//  |-- displayDetails() 
// Feel free to add properties and methods to Employee Class 
// Note: if we try to store any object other than Employee Object in HashSet, we should not be 
// allowed to. 
import java.util.HashSet;
import java.util.Objects;
class Employee 
{
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() 
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println();
    }
   

    //ensure that Employee objects with the same ID are considered equal
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
          
        
        return true;
    }


    
}

public class Exp1 
{
    public static void main(String[] args) 
    {
        HashSet<Employee> employeeSet = new HashSet<>();

        // Add employee objects to the HashSet
        Employee employee1 = new Employee(1, "John Doe", 50000, "HR");
        Employee employee2 = new Employee(2, "Jane Smith", 60000, "IT");
        employeeSet.add(employee1);
        employeeSet.add(employee2);

        //adding same values
        Employee employee3 = new Employee(2, "Jane Smith", 60000, "IT");
        Employee employee4 = new Employee(3, "Jane Smith", 60000, "IT");
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        // Display the details of employees in the HashSet
        for (Employee employee : employeeSet) 
        {
            employee.displayDetails();
        }
    }
}
