class Solution {
    public int balancedStringSplit(String s) {
        int lCounter = 0, rCounter = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') lCounter++;
            else if (s.charAt(i) == 'R') rCounter++;
            if (lCounter == rCounter) count++;
        }
        return count;
    }
}
