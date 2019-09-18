import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().equals(""))
        {
           System.out.println("0"); 
        }else
        {
        String str[]=s.trim().split("[!,?._'@\\s]+");
        int t=0;
       int i=str.length;
        System.out.println(i);
        for(int j=0; j<i; j++)
        {
            System.out.println(str[j]);
        }
       
    }
}
}
