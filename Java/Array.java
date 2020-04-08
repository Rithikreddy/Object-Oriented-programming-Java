package array;                      //In the package only one class must be public in a file if we want more than one than use 2 different files
class A{
    private String s;
    void setString(String s){
        this.s=s;
    }
    String getString(){
        return this.s;
    }
    void passArray(int a[]){
        int i=0;
        for(i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[i]);
        System.out.println(a.length);                 //Length is a filed not a function
    }
    int[] sendArray(int a[]){                         //It works 
        return a;
    }
}
public class Array{
    public static void main(String args[]){
        int[] a = new int[10];                      //Remember new int(10) is wrong new int[10] is right
        for(int i=0;i<10;i++){
            a[i]=i+1;
        }
        A arr = new A();
        arr.passArray(a);
        a=arr.sendArray(a);
                                                    //Remember new int(10) is wrong new int[10] is right
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
