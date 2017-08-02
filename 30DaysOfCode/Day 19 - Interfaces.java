import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

//To DO
class Calculator implements AdvancedArithmetic{
	int sum=0;
	
	@Override
	public int divisorSum(int n) {
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				sum += i;
			}
		}
		return sum;
	}	
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}


Sample Input:

6

Sample Output:

I implemented: AdvancedArithmetic
12