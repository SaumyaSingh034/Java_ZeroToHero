package CustomException;

public class BankingApplication {

    public static void main(String[] args){
        try{
            double balance = withdraw(1000.0, 1500.0);
        } catch (InsufficientFund e) {
           System.out.println("Transaction Failed : "+e.getMessage());
        }
        finally {
            System.out.println("Trasanction Completed");
        }
    }

    private static double withdraw(double balance, double amount) throws InsufficientFund {
        if(amount > balance){
            throw new InsufficientFund("Insufficient funds. Available balance: " + balance);
        }
        return balance-amount;
    }
}
