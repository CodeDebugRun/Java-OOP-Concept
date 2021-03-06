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
        //System.out.println("Bank-----Account-----Constructor ");
        //Varsayilan degerler boyle yazilabilir ancak olusturdugumuz constructor method unu
        //varsayilan olusturmak icin bu metoddan tekrar cagirabiliriz
        /*this.name = "Default Name";
        this.surname = "DefaultSurname";
        this.address = "DefaultAddress";
        this.emailAddress = "DefaultEmailAddress";
        this.phoneNumber = "DefaultPhoneNumber";
        this.accountNumber = "DefaultAccountNumber";
        this.IBANNumber = "DefaultIBANNumber";*/
        //Varsayilan icin metod cagirma
        this ("Default Name", "Default Surname", "Default Address",
                "Default Email Address", "DefaultPhoneNumber",
                "Default IBAN Number", "Default Account Number");
        this.accountBalance = 0.0;//deger girilmesede default olarak sifir ataniyor
        this.depositBalance = 0.0;
        this.withdrawBalance = 0.0;
        this.remainingBalance = 0.0;

        //Constructor body defaultta bir kez this ile asagidaki metodu cagirabiliriz
        //Ikinci cagirmada hata veriyor.
        //Call to 'this()' must be first statement in constructor body
        //this (0.0, 0.0, 0.0, 0.0);

    }
    public BankAccountConstructor(String name, String surname, String phoneNumber){
       /* this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;

        this.accountBalance = 0.0;
        this.remainingBalance = 0.0;*/
        //Verilerin bir kismi elimizde bir kismini defaultan aliyoruz
        this(name, surname, "address","emailAddress",phoneNumber,
                "ibannumber", "account number");

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
    public void showUserInfo(){
        System.out.println("Kullanici adi : " + this.name);
        System.out.println("Kullanici soyadi : " + this.surname);
        System.out.println("Kullanici adresi : " + this.address);
        System.out.println("Kullanici email : " + this.emailAddress);
        System.out.println("Kullanici telefonu : " + this.phoneNumber);
        System.out.println("Kullanici IBAN  : " + this.IBANNumber);
        System.out.println("Kullanici hesap no : " + this.accountNumber);
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
