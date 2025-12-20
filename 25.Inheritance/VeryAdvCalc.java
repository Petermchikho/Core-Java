public class VeryAdvCalc extends AdvCalc{
    public int power(int base, int exponent){
        int result = 1;
        for(int i=0; i<exponent; i++){
            result *= base;
        }
        return result;

        // return Math.pow(base, exponent);
    }
    
}
