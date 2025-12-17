public class MultiDimensionalArray {

    public static void main(String[] args){
        int nums[][] = new int[3][4];
        int nums3[][][] = new int[3][4][5];

        // specifying the columns (jagged array)
        int nums2[][]= new int[3][4];
        nums2[0]= new int[3];
        nums2[1]= new int[4];
        nums2[2]= new int[5];


        for (int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] =(int)(Math.random() * 100);
            }
        }

        for (int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i =0;i<nums2.length;i++){
            for(int j=0;j<nums2[i].length;j++){
                nums2[i][j] =(int)(Math.random() * 100);
            }
        }
        System.out.println();
        for (int i =0;i<nums2.length;i++){
            for(int j=0;j<nums2[i].length;j++){
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
