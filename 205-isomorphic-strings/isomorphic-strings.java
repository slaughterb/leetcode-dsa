class Solution {
    public boolean isIsomorphic(String s, String t) {
        // unequal lengths can't be substituted to make interchangable words
        if (s.length() != t.length()) {
            return false;
        }

        int[] sMap = new int[200];
        int[] tMap = new int[200];

        for (int i = 0; i < s.length(); i++) {
            // we care more about the index structure of the characters
            // than their values themselves because we are testing to see
            // if the characters can be substituted to interchange between s and t
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }

            // 1-index the character placement so that the first character
            // occurrence isn't confused for the uninitialized value (0)
            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }
        return true;
    }
}