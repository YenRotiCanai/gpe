import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args){
		int[] arr = {3,3};
		int t = 6;
		System.out.println(Arrays.toString(twoSum(arr, t)));
	}

	static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<>();
		int i, c=0;
		for(i=0; i<nums.length; i++){
			c = target - nums[i];
			if(map.containsKey(c)) break;
			map.put(nums[i],i);
			System.out.println(map);
		}
		return new int[] { map.get(c), i};
	}
	//throw new IllegalArgumentException("No Answer");
}