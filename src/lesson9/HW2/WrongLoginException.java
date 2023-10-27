package lesson9.HW2;

public class WrongLoginException extends RuntimeException{

    WrongLoginException() {
        super("Wrong login format");
    }

    WrongLoginException(String message) {
        super(message);
    }

}
