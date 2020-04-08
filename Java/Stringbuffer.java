package string;
public class Stringbuffer{
    public static void main(String args[]){
        //StringBuffer class is used to create a mutable strings
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" A*i*h*");

        System.out.println(sb);

        //Insert function requires the index where we want to insert
        sb.insert(1,"Java");

        System.out.println(sb);

        sb.replace(1,3,"java");         //Here the last index is exclusive


        System.out.println(sb);

        sb.delete(1,3);                 //Last index is exclusive

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        System.out.println(sb.capacity());  //Default capacity is 16.If the length is increased than 16 then it is changed to 2*currentcapacity +2

        System.out.println(sb);

    }
}
