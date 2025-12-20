public class MutablevsImmutableString {
    public static void main(String a[]){
        String name="Peter";

        name = name + " Mchikho";
        System.out.println(name);

        // two references in stack memory one object in heap memory
        String first = "Hello";
        String second = "Hello";
        System.out.println(first==second); // true
        
        // String is immutable
        // StringBuffer is mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Mchikho");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.deleteCharAt(5);
        sb.insert(0,"Hey ");
        sb.setLength(30);
        sb.ensureCapacity(3);

        String str =sb.toString();
        System.out.println(str);

    }
    
}
