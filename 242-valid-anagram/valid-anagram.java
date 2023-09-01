class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.get(s.charAt(i)) == null) {
                sMap.put(s.charAt(i), 1);
            }
            else {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
            if (tMap.get(t.charAt(i)) == null) {
                tMap.put(t.charAt(i), 1);
            }
            else {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
        }
        for (Character ch : sMap.keySet()) {
            if (!sMap.get(ch).equals(tMap.get(ch))) {
                return false;
            }
        }
        return true;
    }
}