import java.io.*;
import java.util.*;
class Solution{
	static Scanner fs  = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
	   char[] a = fs.next().toCharArray();
       char[] b =fs.next().toCharArray();
       
       Arrays.sort(a);
       Arrays.sort(b);
       int n = a.length;
       char ans = b[n];
       
       for(int i=0;i<n;i++)
        if(a[i] != b[i]){
            ans = b[i];
            break;
        }
        out.println(ans);
        out.flush();
	}
}
