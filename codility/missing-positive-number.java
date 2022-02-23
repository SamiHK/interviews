// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int smallestMissingInteger = 1;
        if (A.length == 0) {
            return smallestMissingInteger;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }
        
        while (set.contains(smallestMissingInteger)) {
            smallestMissingInteger++;
        }

        return smallestMissingInteger;
    }
}

// Given A = [1, 2, 3], the function should return 4.

// Given A = [−1, −3], the function should return 1.

// Write an efficient algorithm for the following assumptions:

// N is an integer within the range [1..100,000];
// each element of array A is an integer within the range [−1,000,000..1,000,000].