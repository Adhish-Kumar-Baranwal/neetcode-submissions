class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hashSet = new HashSet<>();
        int maxLen = 0;

        for(int num : nums){
            hashSet.add(num);
        }

        for(int numSet : hashSet){
            int count = 1;
            if(!hashSet.contains(numSet-1)){
                int n = numSet;
                while(hashSet.contains(n+1)){
                    n++;
                    count++;
                }
            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;

    }
}
