//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        Map<Character,Integer>st=new HashMap<>();
        st.put('I',1);
          st.put('V',5);
          st.put('X',10);
          st.put('L',50);
          st.put('C',100);
          st.put('D',500);
            st.put('M',1000);
            int ans=0;
            for(int i=0;i<s.length();i++){
                if(i<s.length()-1 && st.get(s.charAt(i))<st.get(s.charAt(i+1)))
                {
                    ans=ans-st.get(s.charAt(i));
                }
                else{
                    ans=ans+st.get(s.charAt(i));
                }
            }
        return ans;
        
    }
}