
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}


class Solution{
        
    static int evenlyDivides(int N){
        // code here
        int cnt=0;
        int n=N;
        while(n>0){
            int num = n % 10;
            if( num>0 && N%num == 0){
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }
}
