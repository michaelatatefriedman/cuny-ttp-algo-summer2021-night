// class Solution {
//     public String toLowerCase(String str) {
//         return str.toLowerCase();
//     }
// }
class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder(s.length());
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('A','a');       map.put('B','b');
        map.put('C','c');       map.put('D','d');
        map.put('E','e');       map.put('F','f');
        map.put('G','g');       map.put('H','h');
        map.put('I','i');       map.put('J','j');
        map.put('K','k');       map.put('L','l');
        map.put('M','m');       map.put('N','n');
        map.put('O','o');       map.put('P','p');
        map.put('Q','q');       map.put('R','r');
        map.put('S','s');       map.put('T','t');
        map.put('U','u');       map.put('V','v');
        map.put('W','w');       map.put('X','x');
        map.put('Y','y');       map.put('Z','z');
        for(int i=0;i<s.length();i++){
            if(map.containsValue(s.charAt(i))){
                ans.append(s.charAt(i));
            } else if(map.containsKey(s.charAt(i))){
                ans.append(map.get(s.charAt(i)));
            } else{ // any character other than letters
                ans.append(s.charAt(i));
            }
        }
        
        return ans.toString();

        
    }
}
