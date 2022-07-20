import java.util.Scanner;

public class LoginAccount {
    public boolean login (AccountInfo account) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Enter username please : ");
        username = scanner.nextLine();
        System.out.println("Enter password : ");
        password = scanner.nextLine();

        if (username == null || password == null){
           return false;
        }else if (account.getName().equals(username) && account.getPassword().equals(password)){
            return true;
        } else {
            return false;
        }





    }
}
