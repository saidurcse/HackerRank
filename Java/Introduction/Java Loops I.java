https://www.hackerrank.com/challenges/java-loops-i

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
		 Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " x " + i + " = " + result);
		}
        
        
    }
}

Sample Input:

2

Sample Output:

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20