package ProjectTryCatch;

public class NameValidationException extends Exception{
    String NameexceptionMessage;
    public NameValidationException(String NameexceptionMessage){
        this.NameexceptionMessage = NameexceptionMessage;
    }
    @Override
    public String toString(){
        return NameexceptionMessage;
    }

}
