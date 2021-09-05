import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
		
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
		Solution2 test= new Solution2();
		test.result(N);
        scanner.close();
    }
	
	void result(int n){
		
			if(2<=n&&n<=5&&n%2==0){
			System.out.println("Not Weird");
			}
			else if(6<=n&&n<=20&&n%2==0)
			{
				System.out.println("Weird");
			}
			else if(20<n&&n%2==0){
				System.out.println("Not Weird");
			}
			else{
			System.out.println("Weird");
		}
		
	}
			
}