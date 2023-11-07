package Day10;
import java.util.Arrays;
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int maxi = 0;
        for(int i=0;i<n;i++){
            dist[i] = (int)Math.ceil(dist[i]*1.0/speed[i]);
            maxi = Math.max(maxi,dist[i]);
        }

        Arrays.sort(dist);
        for(int i=0;i<n;i++){
            if(dist[i]<=i)
                return i;
        }
        return n;
    }
}