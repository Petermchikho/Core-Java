class Mobile{
    String brand;
    int price;
    static String name;
    String network;
    static String os = "Android";
 
    public void show(){
        System.out.println(brand + " " + name + " " + price + " " + network + " " + os);
    }
    
    // you can use a static variable inside a static method but not instance variable
    // if you want to use instance variable then you need to pass the object reference
    public static void show1(Mobile obj){
        System.out.println("Static method called" + name + " " + os + " " + obj.brand + " " + obj.price + " " + obj.network);
    }
}

public class StaticMethod {
    public static void main(String a[] ) throws ClassNotFoundException {
        //loading the class
        Class.forName("Mobile");
        Mobile m1 = new Mobile();
        m1.brand="Samsung";       
        

        Mobile.show1(m1);

    }
    
}

