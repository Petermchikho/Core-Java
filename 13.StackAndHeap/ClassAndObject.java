class Calculator
{
    int a = 5;

    public int add(int num1,int num2){

        System.out.println(a);
        int r =num1 + num2;
        return r;
    }

}
public class ClassAndObject{
    public static void main(String[] args){

        int num1=4;
        int num2=5;

        // stack

        // key num 1 value 4

        Calculator calc = new Calculator();

        //key calc in main stack but the object in the heap memory with an address stored as a key in the main stack
        // a in heap 
        // add()
        calc.a = 100;

        int result = calc.add(num1,num2);

        System.out.println(result);

    }
}