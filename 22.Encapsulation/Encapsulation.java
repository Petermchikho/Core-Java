class Human {
    private String name;
    private int age;

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

public class Encapsulation {
    public static void main(String a[]){
        Human person = new Human();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // 5:36:59

    }
    
}
