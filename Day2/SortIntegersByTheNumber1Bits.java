package Day2;
import java.util.*;

// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
public class SortIntegersByTheNumber1Bits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBit(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }
        return res;
    }

    private int countBit(int n) {
        int res = 0;
        while (n != 0) {
            res += 1;
            n = n & (n-1);
        }
        return res;
    }
}
