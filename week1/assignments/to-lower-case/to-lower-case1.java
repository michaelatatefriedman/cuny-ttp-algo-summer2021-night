class Solution {
    public String toLowerCase(String s) {       
       StringBuilder output = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int asciiVal = s.charAt(i);
            if(asciiVal >= 65 && asciiVal <=90){
                output.setCharAt(i,(char)(asciiVal+32));
            }
        }
        return output.toString();
    }
}
