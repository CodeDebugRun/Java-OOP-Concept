package Constructor;

public class Account_Main {
    public static void main(String[] args) {

        BankAccountConstructor account01 = new BankAccountConstructor("Ali veli", "Canal", "Adresi burasi",
                "emailburasi@gmail.com", "telefon no ", "IBAN NO", "accountnumber");


        account01.putMoney(1000);
        account01.putMoney(2000);
        //System.out.println(account01.getAccountBalance());
        account01.getMoney(1500);

        BankAccountConstructor account02 = new BankAccountConstructor();
        //System.out.println(account02.getAccountBalance());

        //3 parametreli method
        BankAccountConstructor account03 = new BankAccountConstructor("Ali veli", "Sahingoz",
                "telefon no" );
        account02.showUserInfo();





    }
}

