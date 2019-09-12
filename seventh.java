import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(t>=0&&t<=500)
        {
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j=0; int o=1;
            int l=0,s=0;

            if(n>=1&&n<=15)
            {
            while(a>=0&&a<=50&&b>=0&&b<=50&&o<=n)
         {   
            
             for(int k=1; k<=o; k++)
                {
                   int u=k-1;
                   int z =2;
                   s=(int)Math.pow(z,u); 
                   l=(s*b);
                }
                
                j= j+l;
            
                System.out.print((j+a)+" ");
                
            
                o++;
            }
            System.out.print("\n");
        }
        
        }
        
    }
    }}


