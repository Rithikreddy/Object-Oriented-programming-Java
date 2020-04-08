package encap;
class A{
    private String colour = "White";
    String getColour(){
        return this.colour;
    }
    void setColour(String s){
        this.colour=s;
    }
}
public class Encapsulation{
    public static void main(String args[]){
        A a = new A();
        a.setColour("Yellow");
        System.out.println(a.getColour());
    }
}
