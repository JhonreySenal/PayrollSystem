
package payrollSystem;

public abstract class employee {
     protected String fullname;
    protected int age;
    protected String address;
    private double sssTax = 5;
    private double pagibigTax = 5;
    private double philhealthTax = 10;
    protected double taxRate = sssTax + pagibigTax + philhealthTax; 

    
    public employee(String fullname, int age, String address) {
        this.fullname = fullname;
        this.age = age;
        this.address = address;
    }

   
    public abstract void displayInfo();
}


