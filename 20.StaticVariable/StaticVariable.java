class Mobile{

    // Everytime you create an object the class loads the static variables only once then object is instantiated
    String brand;
    int price;
    static String name;
    String network;
    static String os = "Android";
    
    // gets called only once when the class is loaded into memory
    static
    {
        name="Phone";
        System.out.println("Static block called");
    }

    // constructor

    public Mobile(){
        brand="Nokia";
        price=15000;
        network="3G";
        System.out.println("Constructor called");
        
    }

    public void show(){
        System.out.println(brand + " " + name + " " + price + " " + network + " " + os);
    }

    public static void display(Mobile obj){
        System.out.println(obj.brand + " " + name + " " + obj.price + " " + obj.network + " " + os);
    }
}

public class StaticVariable {
    public static void main(String a[] ) throws ClassNotFoundException {
        //loading the class
        Class.forName("Mobile");
        Mobile m1 = new Mobile();
        m1.brand="Samsung";
        
        m1.price=20000;
        m1.network="4G";

        Mobile m2 = new Mobile();
        m2.brand="OnePlus";
        
        m2.price=30000;
        m2.network="5G";

        m1.show();
        m2.show();
        
        Mobile.os="Android 11";
        Mobile.name="Galaxy M31";

        System.out.println("After changing OS");

        m1.show();
        m2.show();

        Mobile.display(m1);

    }
    
}
