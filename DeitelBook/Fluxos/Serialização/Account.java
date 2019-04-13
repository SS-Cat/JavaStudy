import java.io.Serializable;

/**
 * Account
 */
public class Account implements Serializable {

    private int Account;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {
        this(0, "", "", 0.0);
    }

    public Account(int Account, String firstName, String lastName, double balance) {
        this.Account = Account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccount() {
        return this.Account;
    }

    public void setAccount(int Account) {
        this.Account = Account;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " Account='" + getAccount() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }

        
}