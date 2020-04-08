abstract class Abstract{
    Abstract()
    {
        System.out.println("Entered the Abstract class Constructor");
    }
    abstract void run();
    void getmethod(){
        System.out.println("Get method from the Abstract class is called");
    }
}
class B extends Abstract{
    void run(){
        System.out.println("Run method from the abstract class is overridden");
    }
}
public class Abstraction{
    public static void main(String args[]){
        B b = new B();
        b.run();
        b.getmethod();
    }
}
