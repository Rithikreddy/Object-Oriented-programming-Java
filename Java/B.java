package mypack;
//import mypackage.*;
//import mypackage.A;           //We can import the package in these 2 types
public class B{
    public static void main(String args[]){
        //A a = new A();                    //This method is also correct
        mypackage.A a = new mypackage.A();
        a.msg();
    }
}