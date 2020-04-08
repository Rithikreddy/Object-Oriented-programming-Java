public class Arrays{
    public static void main(String [] args){
        
        String[] cars = {"Volvo","i10","Verna","Suzuki","Tata"};

        for(String i:cars){
            System.out.println(i);
        }
        
        final int x=5;
        System.out.println(x);
        //x=10;This is the error here because final keyword elements cannot be changed
        String str = (x==5)?"Good Morning":"Good afternoon";
        System.out.println(str);
    }
}
