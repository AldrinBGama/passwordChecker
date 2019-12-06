import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        String rerun;
        do {
            PasswordIsValid password = new PasswordIsValid();
            password.passwordIsValid();

            System.out.println("Type 'yes' to run again or any key to exit");
            rerun=run.nextLine();
        }while (rerun.equalsIgnoreCase("Yes"));
    }
}
