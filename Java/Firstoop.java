class Oop{
    int r;
    String n;
    
    void assign(int a,String b){
        r=a;
        n=b;
        System.out.println("r is "+a+" n is "+b);
    }
}

class Firstoop{
    public static void main(String args[]){
        
        Oop x=new Oop();
        
        x.assign(3,"Hello");
        
        new Oop().assign(4,"anonymous"); //anonymous object is object which is used only once so no need to assign to a variable
    }
    //Don't compile directly compile in 2step way only
}
