package module1.level21_exceptions_2;

public class MyFileException extends RuntimeException {
    String message;
    public MyFileException(String message) {
        this.message = message;
    }
}
