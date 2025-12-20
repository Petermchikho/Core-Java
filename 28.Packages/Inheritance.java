import tools.VeryAdvCalc;

public class Inheritance {
    public static void main(String[] a){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1=obj.add(4,5);
        int r2=obj.sub(4,5);
        int r3=obj.multi(4,5);
        int r4=obj.div(20,5);
        int r5=obj.power(2,3);
        System.out.println("Addition result: " + r1);
        System.out.println("Subtraction result: " + r2);
        System.out.println("Multiplication result: " + r3);
        System.out.println("Division result: " + r4);
        System.out.println("Power result: " + r5);
    }
}
