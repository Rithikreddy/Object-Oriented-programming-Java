package string;
public class Strings{
    public static void main(String args[]){
        char[] ch = {'j','a','v','a'};
        String s = new String(ch);

        // s = "Hello" is an error as the Strings are immutable

        s.concat("tpoint");
        System.out.println(s);      //Here only java is printed as the string objects are immutable(cannot be changed) look at diagram in javatpoint!
        s=s.concat("tpoint");
        System.out.println(s);
    }
}
