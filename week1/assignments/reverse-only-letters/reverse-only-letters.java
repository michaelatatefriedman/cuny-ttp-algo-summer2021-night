class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack  = new Stack<Character>();
        StringBuilder output = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                output.setCharAt(i,stack.pop());
            }
        }
        return output.toString();
    }
}
