import java.io.*;
import java.util.*;
class Solution{
	static Scanner fs  = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
	    
	    int r = fs.nextInt();
       for(int i=1;i<=r;i++){
           for(int j=1;j<=r;j++){
               if(i == 1 || j == 1 || i == r || j == r)
                    out.print("*");
               else
                    out.print(" ");
           }
           out.println();
       }
       	out.flush();
		
	}
}
