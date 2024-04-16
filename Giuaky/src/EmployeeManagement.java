import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();
    private File file = new File("employee.txt");

    public void addEmployee(Employee employee) {
        employees.add(employee);
        saveEmployeesToFile();
    }
    // read info
    public void readEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("-----------------------");
        }
    }
   //  delete employee
   public void deleteEmployee(Scanner scanner) {
       System.out.println("Enter ID: ");
       int ID = scanner.nextInt();
       employees.removeIf(employee -> employee.getId() == ID);
       saveEmployeesToFile();
   }
    // save employees to file
    private void saveEmployeesToFile() {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Employee employee: employees) {
                oos.writeObject(employee);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // load employees from file
    private void loadEmployeesFromFile() {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Employee e = null;
            while (true) {
                Object o = ois.readObject();
                if (o == null) {
                    break;
                } else {
                    e = (Employee) o;
                    this.employees.add(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // create
    public Employee createEmployeeFromInput(Scanner scanner) {
        System.out.println("Enter ID:");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter Birth Day:");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Employee Type (Experience/Fresher/Intern):");
        String employeeType = scanner.nextLine();

        switch (employeeType) {
            case "Experience":
                System.out.println("Enter Experience in Year:");
                int expInYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter Professional Skill:");
                String proSkill = scanner.nextLine();
                return new Experience(ID, fullName, birthDay, phone, email, employeeType, expInYear, proSkill);
            case "Fresher":
                System.out.println("Enter Graduation Date:");
                String graduationDate = scanner.nextLine();
                System.out.println("Enter Graduation Rank:");
                String graduationRank = scanner.nextLine();
                System.out.println("Enter Education:");
                String education = scanner.nextLine();
                return new Fresher(ID, fullName, birthDay, phone, email, employeeType, graduationDate, graduationRank, education);
            case "Intern":
                System.out.println("Enter Majors:");
                String majors = scanner.nextLine();
                System.out.println("Enter Semester:");
                String semester = scanner.nextLine();
                System.out.println("Enter University Name:");
                String universityName = scanner.nextLine();
                return new Intern(ID, fullName, birthDay, phone, email, employeeType, majors, semester, universityName);
            default:
                return null;
        }
    }
}
