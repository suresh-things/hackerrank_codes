import java.util.*;
import java.io.*;
public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        char a_arr[]=new char[c.length()];
        char b_arr[]=new char[d.length()];
        if(d.length()==c.length())
        {
            for(int i=0;i<c.length();i++)
            {
                a_arr[i]=c.charAt(i);
            }
            for(int j=0;j<d.length();j++)
            {
                b_arr[j]=d.charAt(j);
            }
            Arrays.sort(a_arr);
            Arrays.sort(b_arr);
            for(int k=0;k<c.length();k++)
            {
                if(a_arr[k]!=b_arr[k])
                {
                    return false;
                }
        
            }  
        return true;
        
        
        
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
