
package payrollSystem;

import java.util.Scanner;



public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
         System.out.println("=====================");
         System.out.println("   PAYROLL SYSTEM  ");
         System.out.println("=====================");
        System.out.print("How many department? ");
        int size = sc.nextInt();
        sc.nextLine();     
        employee employees[] = new employee[size];
        int loopsize = 0;
        while(loopsize < size){
            for (int i = 0; i < employees.length; i++) {
            String fullname;
            String department;
            String address;
            String contact;
            int age;    
             loopsize++;
            System.out.print("\nEmployee # " + (i+1));
            
            System.out.print(" Enter your Full Name: ");
            fullname = sc.nextLine();
            System.out.println();
            
             System.out.print("Enter your Department: ");
            department = sc.nextLine();
            System.out.println();
            
             System.out.print("Enter your Address: ");
            address = sc.nextLine();
            System.out.println();
            
             System.out.print("Enter your Contact: ");
            contact = sc.nextLine();
            System.out.println();
            
             System.out.print("Enter your Age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            System.out.print("Full time or Part time\n (A.Part time B.Full time): ");
            String time = sc.nextLine();
              
            if(time.equalsIgnoreCase("A")){
                
               System.out.print("Enter Rate Per Hour:P ");
            double ratePerHour = sc.nextDouble();
                System.out.println();
            System.out.print("Enter Work Days in a Week: ");
            int workDays = sc.nextInt();
            sc.nextLine();
                System.out.println();
            System.out.print("Enter Overtime Hours: ");
            int overtimeHours = sc.nextInt();
                System.out.println();
                sc.nextLine(); 
                employees[i] = new partTime(fullname,age,address,ratePerHour,workDays,overtimeHours);
    }else if (time.equalsIgnoreCase("B")) {
                
                 System.out.print("Enter Salary: P ");
                double basicPay = sc.nextDouble();
                System.out.println();
                
             System.out.print("Enter Overtime Hours: ");
            int overtimeHours = sc.nextInt();
             sc.nextLine();
             employees[i] = new fullTime(fullname, age, address, basicPay);
                System.out.println();
    }else{
                System.out.println("Enter a Correct Letter");
            }  
        }
            //DISPLAY OUTPUT
      System.out.println("=====================");
        System.out.println("Employee Information");
        System.out.println("=====================");
        for (employee e : employees) {
            e.displayInfo();
        }
          
    }
        
    }
}

    
        
        
