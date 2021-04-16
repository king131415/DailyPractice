package JavaDateStructure;

class Node1{
    int val;
    Node1 left;
    Node1 right;

    public Node1(int val) {

        this.val = val;
    }
}

public class dateStructureErChaTree {
    /**    1  2  3  4  5  6  7
     *     1
     *   2   3   ==>先序遍历结果: 1  2 4 5 3 6
     * 4  5   6  ==>中序遍历结果: 4  2 5 1 3 6
     *           ==>后序遍历结果: 4  5 2 6 3 1
     */
    public static Node1 creatErTree(){
        Node1 a=new Node1(1);
        Node1 b=new Node1(2);
        Node1 c=new Node1(3);
        Node1 d=new Node1(4);
        Node1 e=new Node1(5);
        Node1 f=new Node1(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        return a;
    }
    //先序遍历
    public static void bianLiErtree(Node1 root){
        if(root==null){
            return ;
        }
         System.out.print(root.val+" ");
        //然后遍历左子树
        bianLiErtree(root.left);
        //遍历右子树
        bianLiErtree(root.right);

    }
    //中序遍历
    public static void bianZhonxuTree(Node1 roof){
        if(roof==null){
            return;
        }
        //遍历左子树
        bianZhonxuTree(roof.left);
        //访问根节点
        System.out.print(roof.val+" ");
        //遍历右子树
        bianZhonxuTree(roof.right);
    }
    //后序遍历结果
    public static void houXuBianliTree(Node1 roof){
        if(roof==null){
            return;
        }
        //遍历左子树
        houXuBianliTree(roof.left);
        //遍历右子树
        houXuBianliTree(roof.right);
        //访问根节点
        System.out.print(roof.val+" ");
    }

    public static void main(String[] args) {
        bianLiErtree(creatErTree()); //先序遍历
        System.out.println();
        bianZhonxuTree(creatErTree()); //中序遍历
        System.out.println();
        houXuBianliTree(creatErTree()); //后序遍历
    }
}
