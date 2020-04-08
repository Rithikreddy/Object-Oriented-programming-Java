class Check{
    static int n;
    static void name(){
        n=3;    //We can change the value without/before instantiating the object
    }
    Check(){
        n++;
        System.out.println(n);
    }
}
public class Static_Method{
    public static void main(String args[]) {
        Check.name();
        System.out.println("With this call value of n is changed to 3");
        Check c1=new Check();
        Check c2=new Check();
        Check c3=new Check();
    }
}
