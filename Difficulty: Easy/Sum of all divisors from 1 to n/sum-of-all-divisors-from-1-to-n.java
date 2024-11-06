//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static long sumOfDivisors(int n) {
        // code here
        
        
        long sum=0;
       
        for(int i=1;i<=n;i++){
           
            sum=sum+(n/i)*i;
           // sum=sum+i;
        }
        return sum;
    }
}