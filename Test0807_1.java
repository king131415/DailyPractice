package javaDailyProctice.Test0807;


import java.util.Stack;

class ListNode {
     int val;
     ListNode next = null;
}


public class Test0807_1 {
    public ListNode reverseBetween (ListNode head, int m, int n){
        if(head==null || m==n){
            return head;
        }
        ListNode pre1=head;
        ListNode cur=head;
        for(int i=1;i<m;i++){
            pre1=cur;
            cur=cur.next;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode after=null;
        for(int i=m;i<n;i++){
            stack.push(cur);
            cur=cur.next;
        }
        after=cur;
        while(!stack.isEmpty()){
            pre1.next=stack.pop();
            pre1=pre1.next;
        }
        pre1.next=after;
        return head;
    }
    public static void main(String[] args) {

    }
}
