public class Array {
    public static void main(String[] args){
        int nums[] = new int[4];
        int nums2[] = {1,23,4,5};

        nums2[0]=29;
        nums[1]=54;

        System.out.println(nums2[0]);
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        for (int i =0;i<nums.length;i++){
            System.out.println("is " + nums[i]);
        }

        //4:00:00

    }
}
