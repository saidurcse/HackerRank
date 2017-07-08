//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();        
        Map<String,Integer> myApp = new HashMap<String,Integer>();
                
        for(int i=0;i<n;i++) {
        	String name = in.next();
        	int phone = in.nextInt();
        	in.nextLine();
        	myApp.put(name,phone);
        }
        
        while(in.hasNext()) {
        	String s = in.next();
        	if(myApp.get(s) == null) {
        		System.out.println("Not found");
        	}
        	else {
        		System.out.println(s + "=" + myApp.get(s));
        	}
        }
       
        in.close();
    }
}

Sample Input:

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output:

sam=99912222
Not found
harry=12299933