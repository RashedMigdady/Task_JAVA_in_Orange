
package company;


public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(String name, int PPD) {
		super(name , PPD);
	}
    
    
    @Override
    public void Reportable_Of_Employee(){
       System.out.println("The Name of employee is : " + getName());
       System.out.println("Employee dues every day is : " + getPPD());
       System.out.println("the Salare is :" + calculateSalary());
    }
    
	@Override
	public int calculateSalary() {
           int PaymentPerDays = getPPD();
		return PaymentPerDays * 25; // 25 days in one month
	}
    
}
