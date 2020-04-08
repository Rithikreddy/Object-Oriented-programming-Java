public class Methodoverload{
    static int overload(int x,int y){
        System.out.println("Entered the int method");
        return x+y;
    }
    static double overload(double x,double y){
        System.out.println("Entered the double method");
        return x+y;
    }
    public static void main(String args[]){
        int x=overload(3,4);
        double y=overload(3,4); //Even though the return type is double it is type casted but double overload function is not called
        double z=overload(3.0,4.0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
