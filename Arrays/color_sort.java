public class Solution {
    public void sortColors(int[] nums) {
        int index0 = 0;
        int index2 = nums.length-1;
        int i = 0;
        while(i<= index2)
        {
            if(nums[i] == 0)
            {
                int temp = nums[i];
                nums[i] = nums[index0];
                nums[index0] = temp;
                index0++;
                i++;
            }
            else if(nums[i] == 2)
            {
                int temp = nums[i];
                nums[i] = nums[index2];
                nums[index2] = temp;
                index2--;
                
            }
            else{
                i++;
            }
        }
        
    }
}
