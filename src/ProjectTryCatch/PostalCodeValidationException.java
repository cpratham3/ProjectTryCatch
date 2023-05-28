package ProjectTryCatch;

public class PostalCodeValidationException extends Exception{
    String PostalCodeExceptionMessage;
    public PostalCodeValidationException(String PostalCodeExceptionMessage) {
        this.PostalCodeExceptionMessage = PostalCodeExceptionMessage;
    }

    @Override
    public String toString() {
        return PostalCodeExceptionMessage;
    }
}
