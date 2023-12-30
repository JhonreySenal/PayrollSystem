
package payrollSystem;


public class partTime extends employee{
    private double ratePerHour,overtimePay;
    private int workDays,overtimeHours;
    
    public partTime(String fullname, int age, String address,double ratePerHour,int workDays,int overtimeHours) {
        super(fullname, age, address);
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
        this.overtimeHours = overtimeHours;
    }
    
    
     
    public void displayInfo() {
        //PART TIME CALCULATION
        double regularPay = ratePerHour * workDays * 8;
        double overtimePay = ratePerHour * overtimeHours * 1.25;
        double salary = regularPay + overtimePay;
        

        System.out.println("\nPart-Time Employee Information:");
        System.out.println("Name: " + fullname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Hourly Rate: $" + ratePerHour);
        System.out.println("Overtime Worked: " + overtimeHours);
         System.out.println("Tax: " + taxRate);
         System.out.println("Overtime Pay: " + overtimePay);
         System.out.println("Salary: " + salary);
       System.out.println("Salary (after tax deduction): $" + (salary - taxRate));
    }

   
    
   
}
