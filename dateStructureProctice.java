package JavaDateStructure;

class ListNode1{
    int val;
    ListNode1 next;

    public ListNode1(int val) {
        this.val = val;
    }
    public static ListNode1 creatMylistNode(){
        ListNode1 a=new ListNode1(1);
        ListNode1 b=new ListNode1(2);
        ListNode1 c=new ListNode1(3);
        ListNode1 e=new ListNode1(4);
        ListNode1 f=new ListNode1(5);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.next=null;
        return a;
    }

    @Override
    public String toString() {
        return "ListNode1{" +
                "val=" + val +
                '}';
    }
}



public class dateStructureProctice {
    public static void main(String[] args) {
        ListNode1 head=ListNode1.creatMylistNode();
        ListNode1 newHead=reverseList(head);
        while (newHead!=null){
            System.out.print(newHead.val+" ");
            newHead=newHead.next;
        }

    }
    public static ListNode1 reverseList(ListNode1 head) {
          if(head==null){
              return null;
          }
          if(head.next==null){
              return head;
          }
          ListNode1 newHead=null;
          ListNode1 pre=null;
          ListNode1 cur=head;
          for(;cur!=null;){
              ListNode1 nextNode=cur.next; //创建一个零时的引用来保存当前节点存放的下一个节点的引用
              if(nextNode==null){
                  newHead=cur;
              }
              cur.next=pre; //修改引用的指向，把当前节点里面的引用指向前一个节点
              pre=cur;    //修改引用的指向
              cur=nextNode;
          }
          return newHead;
    }
}
