public class Employee {
    String name = "";
    double salary = 30000;
    String designation = "junior";

    public void newEmployee(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary + " Tk");
        System.out.println("Employee Designation: " + this.designation);
           
    }

    public void promoteEmployee(String role){
        this.designation = role;

        if(role.equals("senior")){
            this.salary += 25000;
        }

        if(role.equals("lead")){
            this.salary += 50000;
        }

        if(role.equals("manager")){
            this.salary += 75000;
        }
        System.out.println(this.name + " has been promoted to " + this.designation);
        System.out.println("New Salary: " + this.salary + " Tk");
    }

    public void calculateTax(){
        double tax = 0;
        double sal = this.salary;
        if(sal > 30000 && sal < 50000){
            tax = sal * 0.1;
        }
        else if(sal > 50000){
            tax = sal * 0.3;
        }

        if(tax >0 ){
            System.out.println(this.name + " Tax Amount: " + tax + " Tk");
        }
        else{
            System.out.println("No need to pay tax");
        }
    }


}
