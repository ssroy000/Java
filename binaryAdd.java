//Given two binary strings a and b, return their sum as a binary string.

/*

Input: a = "11", b = "1"
Output: "100"

*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        int n = a.length()-1;
        int m = b.length()-1;
        while(n>=0 || m>=0 || count ==1 ){
            if(n>=0){
                count+= a.charAt(n--) - '0';
            }
            if(m>=0){
                count+= b.charAt(m--) - '0';
            }
            res.append(count%2);
            count/=2;
        }
        return res.reverse().toString();
    }
}
