package activities;

public class NotEnoughFundsExc extends RuntimeException {

    public NotEnoughFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }

}