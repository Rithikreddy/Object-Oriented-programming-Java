interface Printable{
    void print();
}
interface Showable extends Printable{           //command for extending an interface
    void show();
}
interface Runnable{
    void run();
    void print();
    default void getmethod(){System.out.println("This is defined using default");}
}
class B implements Showable,Runnable{
    B(){System.out.println("Entered the extended class constructor");}
    public void run(){
        System.out.println("Entered the run method");
    }
    public void print(){
        System.out.println("Entered the run method");   //Here we can see print() is there in both interfaces but as implementation is in extended class
                                                        // So it supports multiple inheritance like this
    }
    public void show(){
        System.out.println("Entered the run method");
    }
}
public class Interface {
    public static void main(String args[]){
        B b = new B();
        b.run();
        b.show();
        b.print();
        b.getmethod();
    }
}