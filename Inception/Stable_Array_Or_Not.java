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
       Map<Integer,Integer> m = new HashMap<>();
       
       for(int i:a)
         m.merge(i,1,Integer::sum);
       boolean flag = true;
       for(Map.Entry<Integer,Integer> i:m.entrySet())
            if(i.getKey() != m.getOrDefault(i.getValue(),0)){
                flag = false;
                break;
            }
       if(flag)
        out.println("YES");
        else
        out.println("NO");
       out.flush();
		
	}
}
