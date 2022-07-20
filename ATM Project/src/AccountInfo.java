public class AccountInfo {
    private String name;
    private String surname;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private String IBANNumber;
    private String accountNumber;
    private String password;
    private double accountBalance;
    private double depositBalance;
    private double withdrawBalance;
    private double remainingBalance;

    public AccountInfo() {

        this ("Default Name", "Default Surname", "Default Address",
                "Default Email Address", "DefaultPhoneNumber",
                "Default IBAN Number", "Default Account Number", "**********");
        this.accountBalance = 0.0;//deger girilmesede default olarak sifir ataniyor
        this.depositBalance = 0.0;
        this.withdrawBalance = 0.0;
        this.remainingBalance = 0.0;



    }
    public AccountInfo(String name, String surname, String phoneNumber){

        this(name, surname, "address","emailAddress",phoneNumber,
                "ibannumber", "account number", "********");

    }
    public AccountInfo(String name, String surname, String address, String emailAddress,
                                  String phoneNumber,String IBANNumber,String accountNumber,String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.IBANNumber = IBANNumber;
        this.accountNumber = accountNumber;
        this.password = password;

    }
    public void showUserInfo(){
        System.out.println("Kullanici adi : " + this.name);
        System.out.println("Kullanici soyadi : " + this.surname);
        System.out.println("Kullanici adresi : " + this.address);
        System.out.println("Kullanici email : " + this.emailAddress);
        System.out.println("Kullanici telefonu : " + this.phoneNumber);
        System.out.println("Kullanici IBAN  : " + this.IBANNumber);
        System.out.println("Kullanici hesap no : " + this.accountNumber);
    }
    public AccountInfo(double accountBalance, double depositBalance, double withdrawBalance,
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
