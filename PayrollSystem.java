package employeePayrollSystem;
import java.util.*;
class  PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        
        Employee employeeToRemove=null;
        for(Employee employee: employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed successfully!");
        }else{
            System.out.println("No employee is present with id= "+id);
        }
    }

    public void displayEmployeeInfo(){
        if(employeeList.isEmpty()){
            System.out.println("No employee details are present.");
        }else{
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
    }
}
