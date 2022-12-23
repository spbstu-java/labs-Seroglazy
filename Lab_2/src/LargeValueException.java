public class LargeValueException extends Exception{

    public LargeValueException(){

        super("N > 1_000_000");
    }
}