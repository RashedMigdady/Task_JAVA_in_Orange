
package company;


public abstract class Employee implements Manager{
    private String name ;
    private int PPD; // Payment per day
    
    public Employee(String name , int PPD){
        this.name = name;
        this.PPD = PPD ; 
    }
    
    public abstract int calculateSalary();
    
    
    public abstract void Reportable_Of_Employee();
    
    public String getName(){
        return name;   
    }
    
    public void setName(String n){
        name  = n ;   
    }
    
    public int getPPD(){
        return PPD;   
    }
    
    public void setPPD(int p){
        PPD  = p ;   
    }
    
    public void setter(int p , String n){
        PPD = p;
        name = n ;     
    }
    
    
    
    
    
}
