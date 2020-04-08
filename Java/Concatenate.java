public class Concatenate{
    public static void main(String args[]){
        String s="Hello",t="Good Morning";
        s=s+" "+t;
        System.out.println("After Concatenation the string is "+s);
        //Or we can use the below method for concatenating
        //System.out.println(s.concat(" "+t));
        System.out.println(s.concat(t));
        int idx = s.indexOf("Good");
        System.out.println("The index of Good in string s is "+idx);
    }
}
