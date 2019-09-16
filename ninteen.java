import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char A[]=a.toCharArray();
        int k,l,p=0,q=0;
        if(a.length()!=b.length())
        {
            return false;
        }
        else
        {
for(int i=0; i<A.length; i++)
        {
            if(b.toLowerCase().contains(Character.toString(A[i]).toLowerCase()))
            {
                for(k=0;k<A.length; k++)
                {
                    if(Character.toString(A[i]).equalsIgnoreCase(Character.toString(A[k])))
                    {
                        p++;
                    }
                }
                p=p-1;
               char B[]=b.toCharArray();
               for(int c=0; c<B.length; c++)
               {
                   
                    if(Character.toString(A[i]).equalsIgnoreCase((Character.toString(B[c]))))
                    {
                        q++;
                    }
               } 
               q=q-1;
              if(q==p)
              {
                        return true; 
              } else
              {
                      return false; 
              }
            }else
              {
                 return false; 
              }
        }
        }
        return false; 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
