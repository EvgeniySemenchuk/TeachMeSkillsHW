package lesson9.HW2;

public class WrongPasswordException extends RuntimeException{

    WrongPasswordException() {
        super("Wrong password format");
    }

    WrongPasswordException(String message){
        super(message);
    }
}
