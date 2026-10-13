class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();

        // if(s.length()!=t.length()){
        //     return false;
        // }

        // for(int i=0; i<s.length(); i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        // }

        // for(int i=0; i<t.length(); i++){
        //     if(!map.containsKey(t.charAt(i))){
        //         return false;
        //     }
        //     map.put(t.charAt(i), map.get(t.charAt(i))-1);
        //     if(map.get(t.charAt(i))==0) map.remove(t.charAt(i));
        // }

        // if(map.size()==0)
        //     return true;
        // else
        //     return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}
