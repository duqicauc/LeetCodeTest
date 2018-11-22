package com.perfma;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] res = twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = target - nums[i];
            if (map.get(temp) != null && map.get(temp) != i) {
                result.add(i);
                result.add(map.get(temp));
            }
        }

        List<Integer> resTemp = new ArrayList<>(result);
        int[] res = new int[resTemp.size()];
        for (int i = 0; i < resTemp.size(); i++) {
            res[i] = resTemp.get(i);
        }
        return res;
    }
}
