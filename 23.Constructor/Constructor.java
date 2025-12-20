class Human {
    private String name;
    private int age;
    
    // Constructor
    // never returns any value, not even void
    // every time an object is created, constructor is called

    public Human() {
        System.out.println("A new Human object has been created.");
        age=12;
        name="John Doe";
    }
    // paramaterized constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please provide a valid age.");
        }
    }
}

public class Constructor {
    public static void main(String a[]){
        Human person = new Human();
        Human person2 = new Human("Alice", 30);
        // person.setName("Alice");
        // person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());

    }
    
}
