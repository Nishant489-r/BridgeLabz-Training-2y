package ExceptionHandling;
class AccountNotFoundException extends Exception { AccountNotFoundException(String m){super(m);} }

class BankManager {
    public void verifyAccount() throws AccountNotFoundException {
        throw new AccountNotFoundException("Account not found!");
    }

    public void processTransaction() throws InsufficientFundsException {
        throw new InsufficientFundsException("Not enough balance!");
    }

    public void executeTransaction() throws Exception {
        verifyAccount();
        processTransaction();
    }
}

public class BankTransactionManager {
    public static void main(String[] args) {
        BankManager b = new BankManager();

        try {
            b.executeTransaction();
        } catch (AccountNotFoundException e) {
            System.out.println("Account Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Balance Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
