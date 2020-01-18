
package company;


public class Contractor extends Employee {
    
    public int numberOfWorkingDays; 
    
    
    public Contractor( String name ,int PPD ,int numberOfWorkingDays ){
        super( name  , PPD );
        this.numberOfWorkingDays = numberOfWorkingDays;
             
    }
    @Override
    public void Reportable_Of_Employee(){
       System.out.println("The Name of employee is : " + getName());
       System.out.println("Employee dues every day is : " + getPPD());
       System.out.println("the Salare is :" + calculateSalary());
    }
    
    @Override
    public int calculateSalary(){
        
        int PaymentPerDay = getPPD();
        
        return PaymentPerDay * numberOfWorkingDays;     
    }
    
    
}
