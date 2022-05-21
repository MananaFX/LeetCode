import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RebuildTree {
    private HashMap<Integer,Integer> indexMap;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        indexMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            indexMap.put(inorder[i],i);
        return Recur(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    TreeNode Recur(int[] preorder, int[] inorder,int startPre,int endPre,int startIn, int endIn){
        if(startPre>endPre)
            return null;
        TreeNode root = new TreeNode(preorder[startPre]);
        int inorder_root =  indexMap.get(preorder[startPre]);
        int left_length = inorder_root-startIn;
        int right_length = endIn-inorder_root;
        root.left=Recur(preorder,inorder,startPre+1,startPre+left_length,startIn,inorder_root-1);
        root.right=Recur(preorder,inorder,startPre+left_length+1,endPre,inorder_root+1,endIn);
    return root;
    }
}
