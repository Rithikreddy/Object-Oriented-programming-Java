class A1{                      //This class shouldn't be public if we want to create it as public we have to cretae in new file
    int rollno;
    String name;


    A1(int rollno,String name){
        this.rollno=rollno;    //as the passed argument names is same as the fields of the class this is used here otherwise no need
        this.name=name;
    }


    A1(A1 obj){                //constructor of type A1 is called
        this.rollno=obj.rollno;
        this.name=obj.name;
    }

    
    A1(int rollno,String name,A1 obj){
        this(obj);
        //this(rollno, name);  //Only first statement of an constructor must invoke another constructor
                        //As there is no assignment statement for rollno the value of rollno is same as the rollno of passed objects
        this.name=name;        //But for assigning values of an object this can be used anytime
    }
                                //Constructor call must be the first statement in the java;
    
    A1 display(A1 obj){
        //this(obj);            //This is wrong we cannot invoke constructor from a method in java
        System.out.println(obj.rollno);
        return this;            //returns the current object
    }
}

class This{
    public static void main(String args[]) {
        
        A1 a = new A1(3,"Hello");
        
        A1 b = new A1(4,"Hey",a); 
        
        b.display(a);             //As we see the values are 4 and Hey but the value is changed
        
        System.out.println(b.rollno);
    }
}
