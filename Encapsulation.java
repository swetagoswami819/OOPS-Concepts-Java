class Account{
    String accountId;
    String username;
    private String Balance;  //Data Hiding
    private String password; //Data Hiding
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account= new Account();
        account.accountId="123";
        account.username="sweta";
        System.out.println(account.accountId+" "+account.username);
        
    }
    
}
