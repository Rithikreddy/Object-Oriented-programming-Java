package tostring;
class A{
    String s = "White";
    int a = 30;
    int b = 60;
    public String toString(){                         //Public is compulsory required Overriding toString() method
        return a+" "+s+" "+b;
    }
}
public class ToString{
    public static void main(String args[]){
        A a = new A();
        System.out.println(a);                  //Printing an object means internally java compiler calls the toString method as we are Overriding our
                                                //Method is called
    }
}
