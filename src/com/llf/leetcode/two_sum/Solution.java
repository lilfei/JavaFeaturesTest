package com.llf.leetcode.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 时间复杂度比较
 * @author Administrator
 *
 */
public class Solution {

	static int[] _nums = { 2, 14, 11, 15, 16, 16, 7 };
	static int _target = 32;
	static int complexity = 0;

	public static void main(String[] args) {
		complexity = 0;
		int[] result1 = twoSum1(_nums, _target);
		System.out.println(Arrays.toString(result1));
		System.out.println(complexity);
		
		complexity = 0;
		int[] result2 = twoSum2(_nums, _target);
		System.out.println(Arrays.toString(result2));
		System.out.println(complexity);
	}

	// O(n2)
	private static int[] twoSum1(int[] nums, int target) {
		int i, j = 0;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				complexity++;
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	// O(n)
	public static int[] twoSum2(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	        complexity++;
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        complexity++;
	        // 此处时间复杂度，有待商榷
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    return null;
	}

}
