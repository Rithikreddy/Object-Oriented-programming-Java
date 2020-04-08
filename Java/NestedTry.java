public class NestedTry{
    public static void main(String args[]){
        try
        {
            try
            {
               int x = 15/0; 
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            System.out.println("In the Nested try"); //Generally if an exception occurs then others statements in the try block will not be executed
                                                     //But here as the exceptions are handled this statement is executing succesfully
            try
            {
                int a[] = new int[5];
                System.out.println(a[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
