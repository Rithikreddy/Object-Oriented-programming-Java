class Check{
    
    static int n;
    String colour="White";
    
    Check(){
        n++;                                //A static can access the data member and can change the value of it
        System.out.println(n);              //We cannot access the colour as we don't know it corresponds to which object
    }

    static void change(int x){
        n=x;
    }

    void nochange(int x){
        n=x;                            //We can change the static value from a non static method also
        System.out.println(n);
    } 
}

public class Static{
    public static void main(String args[]) {
        
        //change(3);                       //It shouldn't be changed like that becuase it don't know which change function is called
        
        Check.change(3);                   //now n is changed to 3
        
        Check c1=new Check();
        Check c2=new Check();
        Check c3=new Check();               // 4,5,6 is displayed
        c1.nochange(5);
    }
}
