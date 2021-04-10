package javaSe0204;

class Node1{
    private int val;
    private Node1 next;

    public Node1(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "val=" + val +
                '}';
    }

    public static Node1 MylinkedList(){
        Node1 a=new Node1(1);
        Node1 b=new Node1(2);
        Node1 c=new Node1(3);
        Node1 d=new Node1(4);
        Node1 e=new Node1(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        return a;

    }
    public static  int size(Node1 a){
        int size=0;
        for(Node1 cur=a;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    //验证头插
    public static Node1 hesdInsert(Node1 a,int number){
        if(a==null){
            return null;
        }
        Node1 newhead=new Node1(number);
        newhead.next=a;
        a=newhead;
        return a;
    }
    //验证尾部插入
    public static  Node1 tailInsert(Node1 a,int number){
        if(a==null){
            return null;
        }
        while (a.next!=null){
            a=a.next;
        }
        Node1 tem= new Node1(number);
        a.next=tem;
        return a;
    }
    //验证中间插入
    public static   Node1 anywhereInsert(Node1 a,int number,int pos){
        if(a==null){
            Node1 newA=new Node1(number);
            return newA;
        }
        Node1 pre=a;
        for(int i=1;i<pos;i++){
             pre=pre.next;
         }
        Node1 toinsert=new Node1(number); //创建一个插入的新节点
        toinsert.next=pre.next;
        pre.next=toinsert;
        return a;
    }
    //按节点删除操作
    public static Node1 Myremove(Node1 a, Node1 toDelete){
        if(a==null){
            return null;
        }
        if(a==toDelete){
            a=a.next;
            return a;
        }
         Node1 pre=a;
        while (pre!=null && pre.next!=toDelete){
            pre=pre.next;
        }
        if(pre==null){
            return a;
        }
        pre.next=toDelete.next;
        return a;
    }
    //按照节点的下标来上删除
    public static Node1 removeIndex(Node1 a,int index){
        if(index<0 || index>= size(a)){
            return a;
        }
        if(index==0){
            a=a.next;
            return a;
        }
        for(int i=0;i<index-1;i++){
            a=a.next;
        }
        Node1 toDelete=a.next;
        a.next=toDelete.next;
        return a;
    }
    public static Node1 MyremoveVal(Node1 a,int val){
        if(a==null){
            return null;
        }
        Node1 pre=a;
        for(;pre.next!=null;pre=pre.next){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }
        }
        if(a.val==val){
            a=a.next;
        }
        return a;
    }
    public  static void Myprint(Node1 a){
        for(;a!=null;a=a.next){
            System.out.println(a);
        }
    }
}

public class TestMylinkedList {
    public static void main(String[] args) {
        // 实现链表的插入和删除操作, 并能画出对应的图
       Node1 a=Node1.MylinkedList();
       System.out.println("待操作的链表！");
       Node1.Myprint(a);
       System.out.println("==========");
       System.out.println("验证头插:30!");
       a=Node1.hesdInsert(a,30);
       Node1.Myprint(a);
       System.out.println("==========");
       System.out.println("验证尾部插入:60!");
       Node1.tailInsert(a,60);
       Node1.Myprint(a);
       System.out.println("=========");
       System.out.println("验证中间位置插入:");
       Node1.anywhereInsert(a,30,3);
       Node1.Myprint(a);
       System.out.println("============");
       System.out.println("按照节点的下标来删除：");
       Node1.removeIndex(a,2);
       Node1.Myprint(a);
       System.out.println("==========");
       System.out.println("按照节点的位置删除节点");
       Node1.Myremove(a,new Node1(3));
       Node1.Myprint(a);
       System.out.println("===============");
       System.out.println("按照节点的值来删除:");
       a=Node1.MyremoveVal(a,30);
       Node1.Myprint(a);
    }
}
