package Day1;

// https://leetcode.com/problems/poor-pigs/description/
// 458. Poor Pigs
public class PoorPigs {
    public int poorPigs(int buckets, int tdie, int ttest)
    {
        int test = ttest/tdie;
        int i=0;
        while(Math.pow(test+1,i)< buckets) {
            i++;
        }
        return i;
    }
}
