package Day4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ModeInBST {
    public int[] findMode(TreeNode root) {
        if(root==null)
            return new int[0];
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        q.add(root);
        int maxi = 0;

        while (!q.isEmpty()){
            TreeNode tmp = q.remove();

            if(!hm.containsKey(tmp.val))
                hm.put(tmp.val,0);

            hm.put(tmp.val,hm.get(tmp.val)+1);
            maxi = Math.max(maxi,hm.get(tmp.val));


            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key:hm.keySet()){
            if(hm.get(key)==maxi)
                ans.add(key);
        }

        int anss[] = ans.stream().mapToInt(i->i).toArray();
        return  anss;

    }
}
