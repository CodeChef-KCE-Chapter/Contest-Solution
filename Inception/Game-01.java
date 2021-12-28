import java.io.*;
import java.util.*;
class Solution{
	static Scanner fs  = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
	    int n = fs.nextInt();
       int[] a = new int[n];
       for(int i=0;i<n;i++)
            a[i] = fs.nextInt();
       int i = 0,j = n-1,as = 0,bs = 0;
       while(i<j){
           if(as<=bs){
               as += a[i];
               i++;
           }
           else{
               bs += a[j];
               j--;
           }
       }
       int k = n-j;
       if(i > k)
       		out.println("alice");
       else if(i < k)
       		out.println("bob");
       else 
       		out.println("tie");
       	out.flush();
		
	}
}
