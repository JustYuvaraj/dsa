package Arrays;

public class Main{
    public static void main(String args[]){
       /*  int[] nums = new  int[5];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        System.out.println(Array.toString(nums)); 

        int[] nums1 = {0 , 1 , 2 , 3, 4};
        System.out.println(java.util.Arrays.toString(nums1));
        System.out.println(nums1.length); */
        Array arr = new Array(3);
        arr.insert(0);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.removeAt(0);
        arr.removeAt(arr.length() - 1);


        arr.print();
       

    }
}