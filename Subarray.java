import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
        int arr[]=new int[arr_size];
        int count=0;
    
        for(int i=0;i<arr_size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr_size;i++)
        {
            for(int j=i;j<arr_size;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
