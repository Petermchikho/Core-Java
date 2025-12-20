// every class in java extends the object class
class A{
    public A(){
        super();
        System.out.println("Constructor of class A is called");
    }

    public A(int n){
        super();
        System.out.println("Constructor of class A with parameter " + n);
    }

}

class B extends A{

    public B(){
        super(5); // calls the constructor of class A
        System.out.println("Constructor of class B is called");
    }

    public B(int n){
        // super(n);
        // this will call the constructor of class B with no parameters
        this();
        System.out.println("Constructor of class B with parameter " + n);
    }
   
}

public class ThisandSuperMethod {
    public static void main(String[] args) {
        B obj = new B(10);

    }
    
}
