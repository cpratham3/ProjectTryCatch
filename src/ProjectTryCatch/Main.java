package ProjectTryCatch;

public class Main {
    public static void main(String[] args) throws PhoneNumberValidationException, NameValidationException, EmailValidationException, PostalCodeValidationException {
        UserDetails UD = new UserDetails();
        UD.getDetails();
    }
}