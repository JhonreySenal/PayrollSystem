
package payrollSystem;


public class fullTime extends employee{
    private double basicPay;
    
    public fullTime(String fullname, int age, String address,double basicPay) {
        super(fullname, age, address);
        this.basicPay = basicPay;
        
    }
    
       
    public void displayInfo() {
        //FULL TIME CALCULATION
        double totalSalary = basicPay - taxRate;

        System.out.println("\nFull-Time Employee Information:");
        System.out.println("Name: " + fullname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Annual Salary: $" + basicPay);
           System.out.println("Tax: " + taxRate);
           System.out.println("Total Salary with tax: " + totalSalary);
        System.out.println("Salary (after tax deduction): $" + (basicPay - taxRate));
    }

    
   
}

    
