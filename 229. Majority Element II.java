// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 

// Constraints:

// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> f = new HashMap<>();
        for(int num:nums){
            f.put(num,f.getOrDefault(num,0)+1);
        }

        // for (Integer key : f.keySet()) {
        //     System.out.println(key + " : " + f.get(key));
        // }
        List<Integer> result = new ArrayList<>();
        for(int key:f.keySet()){
            if(f.get(key)>(n/3)){
                result.add(key);
            }
        }
        return result;
    }
}
