//package basic_math;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class AllDivisors2 {
//	
//	public static void printDisisors(int n) {
//		List <Integer> ls = new ArrayList<>();
//		
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				ls.add(i);
//				
//				if((n/i) != i) ls.add(n/i);
//			}
//		}
//		
//		Collections.sort(ls);
//		
//		for(int divisor : ls) {
//			System.out.print(divisor+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		printDisisors(36);
//
//	}
//
//}

import java.util.*;

public class AllDivisors2 {

    public static void printDivisors(int n) {
        // Equivalent to vector<int> ls
        List<Integer> ls = new ArrayList<>();

        // Optimization: loop runs up to sqrt(n)
        // O(sqrt(n))
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ls.add(i); // Add the first factor
                
                // If the factors are distinct (not a perfect square), add the pair
                if ((n / i) != i) {
                    ls.add(n / i);
                }
            }
        }

        // O(number of factors * log(number of factors))
        Collections.sort(ls);

        // O(number of factors)
        for (int divisor : ls) {
            System.out.print(divisor + " ");
        }
        System.out.println(); // New line for clean output
    }

    public static void main(String[] args) {
        // Testing with 36 as seen in your code comments
        printDivisors(36);
    }
}