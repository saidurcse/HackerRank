https://www.hackerrank.com/challenges/java-stdin-stdout

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}



Sample Input:

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output:

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42