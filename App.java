package employeePayrollSystem;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        PayrollSystem payrollSystem=new PayrollSystem();
        Scanner sc=new Scanner(System.in);
        int option=1;
        while(option!=4){
            System.out.println("Enter \n1. for employee details\n2. for adding new employee\n3. for removing an employee\n4.to exit ");
            option=sc.nextInt();
            switch(option){
                case 1:
                payrollSystem.displayEmployeeInfo();
                break;
                case 2:
                int employeeOptn=1;
                while(employeeOptn!=3){
                    System.out.println("Enter\n1.for adding full time employee\n2. for adding part time employee\n3.to go back to main menu");
                    employeeOptn=sc.nextInt();
                    switch(employeeOptn){
                        
                        case 1:
                        System.out.println("Enter name of the employee:\n");
                        String fName=sc.next();
                        System.out.println("Enter id of the employee:\n");
                        int fId=sc.nextInt();
                        System.out.println("Enter monthly salary of the employee:\n");
                        int fSalary=sc.nextInt();
                        FullTimeEmployee fEmp=new FullTimeEmployee(fName, fId, fSalary);
                        payrollSystem.addEmployee(fEmp);
                        System.out.println("Employee successfully added!");
                        break;

                        case 2:
                        System.out.println("Enter name of the employee:\n");
                        String pName=sc.next();
                        System.out.println("Enter id of the employee:\n");
                        int pId=sc.nextInt();
                        System.out.println("Enter the number of hours worked by the employee:\n");
                        int hrsWorked=sc.nextInt();
                        System.out.println("Enter the hourly rate of the employee:\n");
                        int hrlyRate=sc.nextInt();
                        PartTimeEmployee pEmp=new PartTimeEmployee(pName, pId, hrsWorked, hrlyRate);
                        payrollSystem.addEmployee(pEmp);
                        System.out.println("Employee successfully added!");
                        break;

                        case 3:
                        break;

                        default:
                        System.out.println("This is an invalid value.");
                        
                    }
                }
                break;

                case 3:
                System.out.println("Enter the id of the employ to be removed:\n");
                int idToRemove=sc.nextInt();
                payrollSystem.removeEmployee(idToRemove);
                break;

                case 4:
                System.out.println("Program exited successfully.");
                break;

                default:
                System.out.println("This is an invalid value.");
                break;
            }
        }
        sc.close();
    }
}
