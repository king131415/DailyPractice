package JavaDateStructure;

/**
 * 编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
 * 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
 * 建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
 *
 */


import java.util.Scanner;
public class CreateTree{
    public static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode (char val){
            this.val=val;
        }
    }
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            String line=scanner.next();
            TreeNode root=build(line);
            inOrder(root);
            System.out.println();

        }
    }
    public static int index=0;
    public static TreeNode build(String line){
        index=0;
        return _build(line);
    }
    public static TreeNode _build(String line){
        char ch=line.charAt(index);
        if(ch=='#'){
            //当前节点是一个空树，直接返回null即可
            return null;
        }
        //构建一个根，同时下标要加一
        TreeNode root=new TreeNode(ch);
        index++;
        //构建左子树
        root.left=_build(line);
        index++;
        //构建右子树
        root.right=_build(line);
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
}