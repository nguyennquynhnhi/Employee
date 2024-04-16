import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement e = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose: "+
                    "\n1. Create employee." +
                    "\n2. Read info." +
                    "\n3. Update info." +
                    "\n4. Delete employee." +
                    "\n5. Exit.");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Create a employee: ");
                    Employee nv = e.createEmployeeFromInput(sc);
                    System.out.println("Successful!");
                    e.addEmployee(nv);
                    break;
                case 2:
                    System.out.println("Info:  ");
                    e.readEmployees();
                    break;
                case 3:
                    System.out.println("Update info: ");
                    break;
                case 4:
                    System.out.println("Delete a employee: ");
                    e.deleteEmployee(sc);
                    System.out.println("Successful!");
                    break;
                default:
                    exit(0);
            }
        }
    }
}
