import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int f=0;
        char[] a =A.toCharArray();
        int len=a.length;

        for(int i=0; i<=len-1; i++)
        {
            if(a[i]==a[len-i-1])
            {
                f=1;
            }
            else
            {
                f=0;
                break;
            }
        
        }
        if(f==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



