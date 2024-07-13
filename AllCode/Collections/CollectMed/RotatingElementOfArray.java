package CollectMed;

public class RotatingElementOfArray {
    public static void rotate(int[] nums){
        int temp = nums[0];
        int size = nums.length;
        for(int index =1; index < size; index++){
            nums[index-1] = nums[index];
        }
        nums[size-1] = temp;
    }
    public static void main(String[] args) {
        int[] result = {1,2,3,4,5};
        for(int index = 0; index < result.length; index++){
            System.out.println(result[index]);
        }
        System.out.println();
        rotate(result);
    }
}
