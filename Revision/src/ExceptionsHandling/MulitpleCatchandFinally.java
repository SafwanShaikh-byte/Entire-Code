package ExceptionsHandling;

public class MulitpleCatchandFinally
{
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());  // NullPointerException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } 
        finally {
            System.out.println("Always executed!");
        }
    }
}
