
package work03;

import java.util.Objects;
import work01.Utilitor;
import work02.Person;


public class Account {
    private static long NextNo = 100_000_000;
    private final long no;
    private final Person owner;
    private double balance;
    
    Utilitor utilf = new Utilitor();

    public Account(Person owner) {
        if (owner == null) {throw new NullPointerException();}
        this.owner = owner;
        this.balance = 0;
        Utilitor util = new Utilitor();
        long result;
        do {
            result = util.computeIsbn10(NextNo);
            NextNo++;
        } while (result == 10);
        this.no = 10 * NextNo + result;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount) {
        utilf.testPositive(amount);
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        utilf.testPositive(amount);
        utilf.testPositive(balance - amount);
        balance = balance - amount;
        return balance;
    }
    public void transfer(double amount, Account account) {
        utilf.testPositive(amount);
        utilf.testPositive(balance - amount);
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" + "no=" + no + ", balance=" + balance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else return false;
    }
    
}