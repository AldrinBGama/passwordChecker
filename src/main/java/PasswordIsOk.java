public class PasswordIsOk {
    public static boolean passwordIsOk (String password) {

        String lowerCaseLetters = "(.*[a-z].*)";
        String upperCaseLetters = "(.*[A-Z].*)";
        String specialChars = "(.*[~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/, ,?].*$)";
        String numbers = ".*([0-9]).*";

        if (password.length() < 8 && password.matches(lowerCaseLetters) && password.matches(upperCaseLetters)
        && password.matches(specialChars) || password.matches(numbers)) {
            System.out.println("Password is Ok!!");
        } else {
            System.out.println("");
        }
        return true;
    }
}
