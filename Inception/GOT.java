import java.io.*;
import java.util.*;
class Solution{
	static Scanner fs  = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
	    int min = fs.nextInt();
        int max = fs.nextInt();
        int ans = 0;
        outer:for(int i=min;i<=max;i++){
            int m = i;
            while(m > 0){
                int r = m%10;
                if(r == 0 || i%r !=0) continue outer;
                m /= 10;
            }
            ans++;
        }
        out.println(ans);
        out.flush();
		
	}
}
