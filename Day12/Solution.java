package Day12;

public class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xDistance = Math.abs(sx - fx);
        int yDistance = Math.abs(sy - fy);

        int min_dist = Math.min(xDistance, yDistance) + Math.abs(yDistance - xDistance);
        if (min_dist == 0) {
            if (t == 1) {
                return false;
            } else {
                return true;
            }
        }

        return t >= min_dist;
    }
}