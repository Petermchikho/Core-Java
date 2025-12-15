class Computer
{
    
    public int addNumbers(int num1,int num2,int num3){
        return num1 + num2 + num3;

    }
    public int addNumbers(int num1,int num2){
        return num1 + num2;

    }
    public double addNumbers(double num1,double num2){
        return num1 + num2;

    }

}
public class Methods {
    public static void main(String[] args){
        Computer obj = new Computer();

        int result = obj.addNumbers(20, 30);

        System.out.println(result);

    }
}
