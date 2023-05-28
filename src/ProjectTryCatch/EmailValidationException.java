package ProjectTryCatch;

public class EmailValidationException extends Exception{
    String EmailExceptionMessage;
    public EmailValidationException(String EmailExceptionMessage) {
        this.EmailExceptionMessage = EmailExceptionMessage;
    }

    @Override
    public String toString() {
        return EmailExceptionMessage;
    }
}
