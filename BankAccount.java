import sun.net.www.content.text.plain;

public class BankAccount
{
    public double PF(double  total_base){
        return (0.12*total_base);

    }
    public double withdraw (int p,double total_base){
      
        return(total_base - p);
        
    }
    public double credit(int q,double total_base){
        return (total_base + q);


    }
  
    
    
        

}