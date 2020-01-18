package company;

public class Company {
    
    public static int recursion(int x){
        if (x == 30){
          return 0;
        }
            
        return recursion(x+1);
    }

    
    public static void main(String[] args) {
       
       Contractor obj1 = new Contractor("rashed" ,10 , 3);
       FullTimeEmployee obj2 = new FullTimeEmployee("ALi" , 5 );
       int rashed = obj1.calculateSalary();
       int ali = obj2.calculateSalary();
       System.out.println(rashed);
       System.out.println(ali);
       
       obj1.Reportable_Of_Employee();
       obj2.Reportable_Of_Employee();
       
       
       
       
    }
    
}
