package javaDailyProctice.Test0712;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Test0712_2 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null; //定义链表的前置节点
        for(ListNode cur=head;cur!=null;){ //循环修改链表的引用指向
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

}
