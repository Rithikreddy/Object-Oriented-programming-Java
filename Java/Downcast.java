class Animal{
    String colour = "White";
    static void method(Animal a){
        System.out.println("The animal colour is "+a.colour);
    }
}
class Dog extends Animal{
    String sound = "Bow";
    Dog run(){
        System.out.println("The Dog sound is "+this.sound);
        return this;
    }
    Dog downcasting(Animal a){
        if(a instanceof Animal){
            Dog c,d = (Dog)a;
            c=d.run();
            return c;
        }
        return this;
    }
}
public class Downcast{
    public static void main(String args[]){
        //Animal a = new Animal();
        //Dog d = (Dog)a;                   //Directly downcasting is not possible so we use instanceof for downcasting
        //Animal a = new Dog();
        //Dog c;
        //c = a.downcasting(a);               //we cannot call the Dog's method using the variable declared with superclass
        //c.run();
    }
}