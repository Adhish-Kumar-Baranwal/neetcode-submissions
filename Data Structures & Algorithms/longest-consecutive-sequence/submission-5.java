class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }

        for(int num : nums){
            int count = 1;
            if(!hashSet.contains(num-1)){
                int n = num;
                while(hashSet.contains(n+1)){
                    n+=1;
                    count++;
                }
            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;

    }
}
