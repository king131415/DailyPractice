package javaDailyProctice;


import javaHomeWork.A;

/**
 *   实现链表题目: 合并两个有序链表
 */

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public static ListNode creatMylistNode1(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        a.next=b;
        b.next=c;
        c.next=null;
        return a;
    }
    public static ListNode creatMylistNode2(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(4);
        a.next=b;
        b.next=c;
        c.next=null;
        return a;
    }
    public static ListNode creatMylistNode3(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(8);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        return a;
    }
    public static ListNode creatMylistNode5(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        a.next=b;
        b.next=null;
        return a;
    }
    public static ListNode creatMyListNode6(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode e=new ListNode(3);
        ListNode f=new ListNode(2);
        ListNode h=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.next=h;
        h.next=null;
        return a;
    }
}

public class pricticeDay1 {
    public static void main(String[] args) {
//        ListNode head= mergeTwoLists(ListNode.creatMylistNode1(),ListNode.creatMylistNode2());
//        System.out.println("合并后的链表为：");
//        for(;head!=null;head=head.next){
//            System.out.print(head.val+" ");
//        }
//         ListNode newHead= partition(ListNode.creatMylistNode3(),4);
//         while (newHead!=null){
//             System.out.print(newHead.val+" ");
//             newHead=newHead.next;
//         }
//       boolean result= hasCycle(ListNode.creatMylistNode5());
//        System.out.println(result);
//        boolean result=chkPalindrome(ListNode.creatMyListNode6());
//        System.out.println(result);


    }
    public ListNode detectCycle(ListNode head) {
       ListNode fast=head;   //定义快慢引用
       ListNode slow=head;
       while (fast!=null && fast.next!=null){
           fast=fast.next.next; //快引用比慢引用快一步，若有环就能相遇
           slow=slow.next;
           if(fast==slow){   //如果相遇了就跳出循环
               break;
           }
       }
       if(fast==null || fast.next==null){ //说明不带环
           return null;
       }
       ListNode curA=head;
       ListNode curB=fast;
       while (curA!=curB){ //带环后相遇点就是是带环的入口
           curA=curA.next;
           curB=curB.next;
       }
       return curA;
    }






    public ListNode deleteDuplication(ListNode pHead) {
        /**
         * 删除重复的节点 1==>2==>2==>3==>4 变成 1==>3==>4
         */
        if(pHead==null){
            return null;
        }else if(pHead.next==null){
            return pHead;
        }
        ListNode domy=new ListNode(0);
        ListNode newTail=domy;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if(cur.next!=null && cur.val==cur.next.val){
                while (cur!=null && cur.next!=null && cur.val==cur.next.val){ //跳过重复的节点
                    cur=cur.next;
                }
            }else {
                newTail.next=new ListNode(cur.val); //对不重复的节点进行尾插到傀儡链表
                newTail=newTail.next;
            }
        }
        return domy.next; //返回傀儡节点的后一个节点
    }



    public static boolean chkPalindrome(ListNode A) {
        /**
         * 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
         * 给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
         * 测试样例：
         * 1->2->2->1
         * 返回：true
         */
        if(A==null){  //特殊情况的判断
            return true;
        }else if(A.next==null){
            return true;
        }
        int count=0;  //定义一个临时变量记录链表的长度
        for(ListNode cur=A;cur!=null;cur=cur.next){
            count++;
        }
        int steps=count/2;    //把链表分成两个
        ListNode cur1=A;
        for(int i=0;i<steps;i++){
            cur1=cur1.next;
        }
        ListNode pre=null;
        ListNode newCur=cur1;   //反转后半个链表
        for(;newCur!=null;){
            ListNode next=newCur.next; //创建一个零时引用保存当前链表的下一个地址的引用
            if(next==null){
                cur1=newCur;  //更换新的表头
            }
            newCur.next=pre;
            pre=newCur;  //更新引用的位置
            newCur=next;

        }
        ListNode cur2=A;
        ListNode cur3=cur1;
        while (cur2!=null && cur3!=null){
            if(cur2.val!=cur3.val){
                return false;
            }
            cur2=cur2.next;
            cur3=cur3.next;
        }
        return true;
    }

    public static   boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }else if(head.next==null){
            return false;
        }
        ListNode fast=head; //快引用
        ListNode Slow=head; //慢引用
        for(;fast!=null && Slow!=null && fast.next!=null ;){
            fast=fast.next.next;
            Slow=Slow.next;
            if(fast==Slow){ //若快慢引用相等了，说明链表一定是带环的
                return true;
            }
        }
        return false; //否则就是不带环的
    }





    public  static   ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null|| headB==null){  //若其中有一个链表是空，则直接返回空
            return null;
        }
        int count1=0;    //定义一个局部变量用来记录链表A的长度
        int count2=0;   //定义一个局部变量用来记录链表B的长度
        ListNode cur1=headA; //搞两个链表引用用来接收链表A，B的头节点
        ListNode cur2=headB;
        for(;cur1!=null;cur1=cur1.next){  //分别遍历A，B链表得到A与B链表的长度
            count1++;
        }
        for(;cur2!=null;cur2=cur2.next){
            count2++;
        }
        if(count1>count2){  //若链表A的长度大于B,则让A链表先走长度之差步
            int steps=count1-count2;
            ListNode Acur=headA;
            for(int i=0;i<steps;i++){
                Acur=Acur.next;
            }
            for(ListNode Bcur=headB;Bcur!=null && Acur!=null;Bcur=Bcur.next,Acur=Acur.next){
                if(Acur==Bcur){
                    return Acur;
                }
            }
        }else {
            ListNode Bcur=headB;
            for(int i=0;i<count2-count1;i++){
                Bcur=Bcur.next;
            }
            for(ListNode Acur = headA; Acur!=null && Bcur!=null; Acur=Acur.next,Bcur=Bcur.next){
                if(Acur==Bcur){
                    return Bcur;
                }
            }
        }
        return null; //没有相交的节点，返回空！

    }







    public static ListNode partition(ListNode pHead, int x) {
        //   1     5    4     3     6    4    9
        /**
         *
         * 实现链表题目: 给定 x,
         * 把一个链表整理成前半部分小于 x,
         * 后半部分大于等于 x 的形式
         *
         */
        if(pHead==null){
            return null;
        }else if(pHead.next==null){
            return pHead;
        }
        ListNode large=new ListNode(0);
        ListNode large1=large;
        ListNode small=new ListNode(0);
        ListNode small1=small;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if(cur.val<x){
                small1.next=new ListNode(cur.val);
                small1=small1.next;
            }else {
                large1.next=new ListNode(cur.val);
                large1=large1.next;
            }
        }
        small1.next=large.next; //将较小的一部分节点与较大一部分节点连接起来
        return small.next; //放回较小一部分的傀儡节点的后面一个节点
    }



    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){  //判断特殊情况
            return l2;
        }else if (l2==null){
            return l1;
        }
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode node=new ListNode(0);  //创建一个傀儡节点
        ListNode node1=node;
        for(;cur1!=null && cur2!=null;){
            if(cur1.val<cur2.val){
               node1.next=cur1;
               node1=node1.next;  //更新引用的位置
               cur1=cur1.next;
            }else {
                node1.next=cur2;
                node1=node1.next;  //更新引用的位置
                cur2=cur2.next;
            }
        }
        if(cur1==null){
            node1.next=cur2;
        }else {
            node1.next=cur1;
        }
        return node.next; //返回傀儡节点的下一个节点
    }




















    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){  //特殊情况的判断
            return null;
        }
        if(head.next==null){  //若只有一个节点的情况
            return head;
        }
        ListNode cur=head;
        int count=0;
        for(;cur!=null;cur=cur.next){  //通过遍历求出链表的长度
            count++;
        }
        if(k>count){
            return null; //位置非法
        }
        for(int i=0;i<count-k;i++){
            head=head.next;
        }
        return head;
    }

















    public ListNode middleNode(ListNode head) {
       if(head==null){   //特殊情况判断
           return null;
       }
       if (head.next==null){   //只有一个节点判断
           return head;
       }
       ListNode cur=head;
       int count=0;
       for(;cur!=null;cur =cur.next){  //遍历链表得到链表的长度
           count++;
       }
       int steps=count/2;     //从链表头走动的步数
       for(int i=0;i<steps;i++){
           head=head.next;
       }
       return head;  //最后得到想要的节点返回
    }
}
