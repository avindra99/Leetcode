class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        while(right < s.length()){
            char rightChar = s.charAt(right);

            if(!set.contains(rightChar)) {
        set.add(rightChar);
        right++;
        maxLength = Math.max(maxLength, set.size()); 
      }
      else {
        set.remove(s.charAt(left));
        left++; 
      }
    }   
    return maxLength;
        
    }
}