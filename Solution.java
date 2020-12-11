import java.util.*;
public class Solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char arr[]=new char[A.length()];
        String B="";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<A.length();i++)
        {
            arr[i]=A.charAt(i);
            
        }
        System.out.println(arr);
        for(int i=A.length()-1;i>=0;i--)
        {
            B=B+(arr[i]);
        }
        System.out.println(B);
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }

}

