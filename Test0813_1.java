package javaDailyProctice.Test0813;

 class ListNode {
     int val;
     ListNode next = null;
     public  ListNode(int var){
         this.val=var;
     }
 }
public class Test0813_1 {
    public ListNode reverseBetween (ListNode head, int m, int n){
        ListNode dummy = new ListNode(-1);  // 哑巴节点，指向链表的头部
        dummy.next = head;
        ListNode pre = dummy;  // pre 指向要翻转子链表的前驱节点
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;  // head指向翻转子链表的首部
        ListNode next;
        for (int i = m; i < n; i++) {
            next = head.next;
            // head节点连接next节点之后链表部分，也就是向后移动一位
            head.next = next.next;
            // next节点移动到需要反转链表部分的首部
            next.next = pre.next;
            // pre继续为需要反转头节点的前驱节点
            pre.next = next;
        }
        return dummy.next;
    }

}
