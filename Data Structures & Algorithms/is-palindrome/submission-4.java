class Solution {
    public boolean isPalindrome(String s) {
        
        String clnStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = clnStr.length()-1;

        for(int left = 0; left<right; left++, right--){
            if(clnStr.charAt(left) != clnStr.charAt(right)){
                return false;
            }
        }

        return true;

    }
}
