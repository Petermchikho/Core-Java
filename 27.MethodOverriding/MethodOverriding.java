class A{
    public void display(){
        System.out.println("Display method in class A");
    }

    public void config(){
        System.out.println("Config method in class A");
    }
}

class B extends A{
    @Override
    public void display(){
        System.out.println("Display method in class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.config();
        
    }
    
}
