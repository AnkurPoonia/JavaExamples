public class Salary{
    public static void main(String[] args) {
        
        BankAccount bt = new BankAccount();
        double  total_base=20000;
        double a = bt.PF(20000);
        System.out.println("pf deduction is : "+a);
        double b = bt.withdraw(2000,20000);
        System.out.println("total amount after withdrawl is : "+b);
        double c = bt.credit(3000,b);
        System.out.println("total amount after crediting is  : "+c);
      
    }
}