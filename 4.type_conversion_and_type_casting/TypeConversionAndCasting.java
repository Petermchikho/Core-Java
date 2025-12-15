
public class TypeConversionAndCasting {
    public static void main(String args[]){
        byte b=127;
        int a = b;

        float f =5.6f;
        int t = (int) f;

        // Type Promotions

        byte h = 10;
        byte i = 30;

        int result = h * i;

        System.out.println(b);
        System.out.println(a);
        System.out.println(t);
        System.out.println(result);

    }
    
}
