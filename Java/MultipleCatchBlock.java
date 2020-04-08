public class MultipleCatchBlock{
    public static void main(String args[]){
        try{
            //int a[] = new int[5];
            //a[10] = 15/0;
            String s = null;                        //Remember here null is all in small letters unlike in c++,c
            //String s = "";                        //This is correct we don't get any errors with this initialisation
            System.out.println(s.length());
        }
        // catch(Exception e){
        //     System.out.println(e);
        // }                                        //This is wrong parent class exception is always at last
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        // catch(Exception e){
        //     System.out.println("Parent class Exception is Found");
        // }
        finally
        {
            System.out.println("Even though exception occured or and whether exception is handled or not i will be executing this finally always");
        }
        System.out.println("Rest of the code is executed happily");
    }
}
