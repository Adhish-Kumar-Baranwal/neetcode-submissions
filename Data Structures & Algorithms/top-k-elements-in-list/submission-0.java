class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        int counter=0;

        for(int position = nums.length; position>=1 && counter<k; position--){
            if(bucket[position]!= null){
                for(Integer integer : bucket[position]){
                    res[counter++] = integer;
                }
            }
        }

        return res;

    }
}
