import java.util.Scanner;

public class PasswordIsValid {
    public static void passwordIsValid() {
        Scanner userInput = new Scanner( System.in );
        System.out.println("Please enter your password: ");
        String password = userInput.nextLine();
        boolean valid = true;

        if (password.length() <= 0 ) {
            System.out.println("Password should exists");
        }
        if (password.length() <= 8) {
            System.out.println("Password should be more than 8 characters in length.");
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password should contain at least one lower case alphabet");
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            System.out.println("Password should contain at least one upper case alphabet");
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            System.out.println("Password should contain at least one number.");
            valid = false;
        }
        String specialChars = "(.*[~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/, ,?].*$)";
        if (!password.matches(specialChars)) {
            System.out.println("Password should contain at least one special character");
            valid = false;
        }
        if (valid) {
            System.out.println("Password is valid.");
        }
        if (!valid) {
            System.out.println("Password is invalid.");
        }
        PasswordIsOk passOk = new PasswordIsOk();
        passOk.passwordIsOk(password);
    }
}
