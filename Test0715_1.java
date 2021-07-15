package javaDailyProctice.Test0715Code;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

 }


public class Test0715_1 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        //向左边一直走遇到叶子节点返回，一直往下走，找到再也没有子树的节点，交换左右子树
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        //交换节点的左右子树
        root.left=right;
        root.right=left;
        return root;
    }
}
