package ProjectTryCatch;

public class PhoneNumberValidationException extends Exception{
    String PhoneNumberExceptionMessage;
    public PhoneNumberValidationException(String PhoneNumberExceptionMessage) {
        this.PhoneNumberExceptionMessage = PhoneNumberExceptionMessage;
    }

    @Override
    public String toString() {
        return PhoneNumberExceptionMessage;
    }
}
