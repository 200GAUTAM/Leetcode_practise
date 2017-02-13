public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
    {
        return 0;
    }
        if(nums[0]> -2147483648 && nums[0] > nums[1])
        {
            return 0;
        }
        
        for(int i = 1; i<nums.length-1; i++)
        {
            int prev = nums[i-1];
            int now = nums[i];
            int next = nums[i+1];
            
            if(now > prev && now > next)
            {
                return i;
            }
        }
        
        if(nums[nums.length-1] >nums[nums.length-2] && nums[nums.length-1] > -2147483648)
        {
            return nums.length-1;
        }
        
        return -1;
        
    }
}
