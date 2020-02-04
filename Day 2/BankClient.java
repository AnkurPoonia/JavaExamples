public class BankClient{
    public static void main(String[] args) {
        Address address=new Address("228", "H-block dharam colony", "gurugram", 12345);
        Savingaccount s1= new Savingaccount(AccountType.SALARIED_ACCOUNT,20000, address);
        System.out.print(s1.withdraw(200));
       }
    
}