import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5};
		System.out.println(containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
        	if(numbers.contains(nums[i])) return true;
        	numbers.add(nums[i]);
        }
        
        return false;
        
            
    }

}
