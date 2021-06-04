class Solution {
    public int reverse(int x) {
        int rev = 0; // reverse ans
        int temp = 0;// temp int to store reverse integers
        if(Math.abs(x)<10 && Math.abs(x) >=0){
            return x;
        } 
        while(x != 0){
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                                return 0;
            }
            temp = x % 10;
            x = x/10;
            rev = rev *10 + temp;   
        }
        return rev;      
    }
}
