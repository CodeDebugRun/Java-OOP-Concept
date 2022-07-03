package Constructor;

public class BankAccountConstructor {

    private String name;
    private String surname;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private String IBANNumber;
    private String accountNumber;
    private double accountBalance;
    private double depositBalance;
    private double withdrawBalance;
    private double remainingBalance;

    public BankAccountConstructor() {
        System.out.println("BankAccountConstructor");
    }
    public BankAccountConstructor(String name, String surname, String address, String emailAddress,
                                  String phoneNumber,String IBANNumber,String accountNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.IBANNumber = IBANNumber;
        this.accountNumber = accountNumber;

    }
    public BankAccountConstructor(double accountBalance, double depositBalance, double withdrawBalance,
                                  double remainingBalance){
        this.accountBalance = accountBalance;
        this.depositBalance = depositBalance;
        this. withdrawBalance = withdrawBalance;
        this.remainingBalance = remainingBalance;

    }
    public void putMoney (double amount){
        this.accountBalance += amount;
        System.out.println("Your new amount : " + accountBalance);
    }
    public void getMoney(double amount){
        if (amount > 5000) {
            System.out.println("Over than max withdrawable daily cash");
        } else if (accountBalance-amount < 0) {
            System.out.println(amount + " is over than your account balance ");
        } else {
            System.out.println("Your remaining Balance is : " + (accountBalance-amount));
            accountBalance -= amount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIBANNumber() {
        return IBANNumber;
    }

    public void setIBANNumber(String IBANNumber) {
        this.IBANNumber = IBANNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public double getWithdrawBalance() {
        return withdrawBalance;
    }

    public void setWithdrawBalance(double withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }
    public double getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }
}
