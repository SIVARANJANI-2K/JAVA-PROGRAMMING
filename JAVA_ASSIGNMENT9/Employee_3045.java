import java.io.*;
import java.util.ArrayList;
import java.util.*;

class Employee implements Serializable {
    public String name;
    public int id;
    public double salary;
    public String designation;

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public void incrementSalary() {
        switch (this.designation) {
            case "Project-Manager":
                this.salary += this.salary * 0.10; // 10% increase
                break;
            case "Software-Engineer":
                this.salary += this.salary * 0.08; // 8% increase
                break;
            case "Data-Analyst":
                this.salary += this.salary * 0.05; // 5% increase
                break;
            default:
                System.out.println("No salary increment for " + this.designation);
                break;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Scanner sc) {
        System.out.println("Enter employee details (name, ID, salary, designation):");
        String name = sc.next();
        int id = Integer.parseInt(sc.next());
        double salary = Double.parseDouble(sc.next());
        //sc.nextLine(); // Consume newline
        String designation = sc.nextLine();

        Employee e = new Employee(name, id, salary, designation);
        employees.add(e);
        System.out.println("Employee added successfully.");
    }

    public void deleteEmployee(Scanner sc) {
        System.out.println("Enter employee ID to delete:");
        int id = sc.nextInt();
        employees.removeIf(emp -> emp.id == id);
        System.out.println("Employee deleted successfully.");
    }

    public void updateSalary(Scanner sc) {
        System.out.println("Enter employee ID to update salary:");
        int id = sc.nextInt();
        System.out.println("Enter new salary:");
        double newSalary = sc.nextDouble();

        for (Employee emp : employees) {
            if (emp.id == id) {
                emp.salary = newSalary;
                System.out.println("Salary updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void displayByDesignation(Scanner sc) {
        System.out.println("Enter designation to display:");
        sc.nextLine(); // Consume newline
        String designation = sc.nextLine();

        for (Employee emp : employees) {
            if (emp.designation.equalsIgnoreCase(designation)) {
                System.out.println(emp);
            }
        }
    }

    public void applySalaryIncrement() {
        for (Employee emp : employees) {
            emp.incrementSalary();
        }
        System.out.println("Salary increments applied based on designations.");
    }

    public void saveToFile(String fileName) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(employees);
        oos.close();
        System.out.println("Employees saved to file.");
    }

    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        employees = (ArrayList<Employee>) ois.readObject();
        ois.close();
        System.out.println("Employees loaded from file.");
    }
}

public class Employee_3045 {
1
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();


        try {
            manager.loadFromFile("employees.dat");
        } catch (Exception e) {
            System.out.println("No existing employee data found."+e);
        }


        while (true) {
            System.out.println("\n1. Add Employee\n2. Delete Employee\n3. Update Salary\n4. Display Employees by Designation\n5. Apply Salary Increment\n6. Save & Exit\nChoose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addEmployee(sc);
                    break;

                case 2:
                    manager.deleteEmployee(sc);
                    break;

                case 3:
                    manager.updateSalary(sc);
                    break;

                case 4:
                    manager.displayByDesignation(sc);
                    break;

                case 5:
                    manager.applySalaryIncrement();
                    break;

                case 6:
                    manager.saveToFile("employees.dat");
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

