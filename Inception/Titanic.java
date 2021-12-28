import java.io.*;
import java.util.*;
class Solution{
	static Scanner fs  = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
	    
	    int x = fs.nextInt(),y = fs.nextInt();
       int n = fs.nextInt(),m = fs.nextInt();
       int ans = 0;
       for(int i=1;i<=m;i++){
           int x1 = fs.nextInt(),y1 = fs.nextInt();
           if(Math.sqrt((Math.pow(x1-x,2) + Math.pow(y1-y,2))) <= n){
               ans++;
           }
       }
       out.println(ans);
       	out.flush();
		
	}
}
