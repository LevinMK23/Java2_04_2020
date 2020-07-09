package lesson2.hw;

public class ArraySizeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Incorrect size";
    }
}
