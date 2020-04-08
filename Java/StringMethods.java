package string;
public class StringMethods{
    public static void main(String args[]){

        //This is from the java.lang.String class

        // For the string comparision 3 methods
        // 1) equals and equlasIgnoreCase method
        // 2) == method
        // 3) compareTo method

        String s1 = new String("Hello");
        String s2 = new String("Hello");    //Here both different types of objects are created
        System.out.println(s1==s2);         //False becuase the in the string pool both objects are created
        System.out.println(s1.equals(s2));  //But equals method only check the values and not the memory reference like ==
        System.out.println(s1.compareTo(s2));   //Even it will print the 0 it only check the values not based on the reference
        String s3 = "Hello";                //A new "Hello" string is created in the memory reference as 
        String s4 = "Hello";
        String s5 = "hello";
        System.out.println(s3==s4);
        System.out.println(s1==s3);         //Will return false because it shouldn't be compared with the string created using new
        System.out.println(s2==s3);
        System.out.println(s3.equalsIgnoreCase(s5));



        //Concatenation
        // can be done in 2 ways using + or concat() function
        
        
        String s6 = s1.concat(s2);
        System.out.println(s6);

        String s7 = s1+" "+s2;
        System.out.println(s7);



        //Substring
        // 2 methods 
        // 1) from start index to end 
        // 2) from start index to the end index start index is inclusive end index is exclusive
        
        
        String s8 = s1.substring(2);

        String s9 = s1.substring(1,4);

        System.out.println(s8);
        System.out.println(s9);

        
        
        //String basic functions


        //Trim function removes the white spaces between the charecters

        String s10 = " H e llo";
        System.out.println(s10.trim());         //Remember only the white spaces until the first charecter found is removed



        //toUpperCase() and toLowerCase() functions are used in converting the strings

        System.out.println(s10.toUpperCase());
        System.out.println(s10.toLowerCase());



        //charAt(index) is used to obtain the charecter present at that index

        System.out.println(s10.charAt(3));


        //ValueOf method converts the int,float,double,long etc into the string

        //Integer c = new Integer(10); This is wrong  It is removed since the JAVA 9

        //Integer c = new int(10);     This is wrong
        
        int b=10;

        Integer c = b;

        String s11 = String.valueOf(c);         //Mostly it is a Static method as to call a static method we use same procedure classname.function()

        String s12 = String.valueOf(b);

        System.out.println(s11);

        System.out.println(s12);

        System.out.println("10"+s11);


        //replace method 

        String s13 = "Anger gives you a lot of power but if you let,it will destroy you";

        System.out.println(s13.replace("you","khu"));
    }
}
