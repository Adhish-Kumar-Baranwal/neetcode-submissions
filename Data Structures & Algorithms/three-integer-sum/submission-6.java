class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                if(nums[i]+nums[j]+nums[k] < 0) j++;
                else if(nums[i]+nums[j]+nums[k] > 0) k--;
                else{
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(nums[k]);
                    resultList.add(tempList);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return resultList;
    }
}
