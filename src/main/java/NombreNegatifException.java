public class NombreNegatifException extends Exception{
    private int value;

    public NombreNegatifException(int value) {
        super("Negative number : " + value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
