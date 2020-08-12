class Person{
    int a;
    String s;
    String colour="White";
    Person(){
        System.out.println("I am printed automatically as super is invoked in child class if super not invoked in child constructor");
    }
    Person(int a,String s){
        this.a=a;
        this.s=s;
    }
    void eat(){
        System.out.println("Eat from the Person(Parent) class is called");
    }
}
                        //Remember Static methods cannot be overridden because Static is instantiated only once in a parent class
class Employee extends Person{
    int salary;
    String colour="Black";
    Employee(int ab,String s,int salary){
        super(ab,s);              //If this statement is commented then the Person() constructor is automatically invoked
        this.salary=salary;
        //if(s=="Hello")          //Once if this if statement is activated if the Colour is static then for every object
                                    //created from that time it's colour field will be changed
        //this.colour=super.colour; //colour of the current object is changed to white
    }
    void eat(){
        super.eat();                //This function calls the overridden function or the parent class function
        System.out.println(a+" "+s+" "+salary+" "+colour);
        System.out.println("Eat from the Employee(Child) class is called");
    }
}
public class Super{
    public static void main(String args[]){
        Employee e = new Employee(3,"Rithik",1000000000);
        e.eat();
        Employee e1 = new Employee(4,"Hello",10000000);
        e1.eat();
    }
}
