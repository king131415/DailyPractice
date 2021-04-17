package JavaDateStructure;

class Node{
    int val;
    Node pre=null;
    Node next=null;

    public Node(int val) {
        this.val = val;
    }
    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

//实现一下自己的链表
class MyLinkedList{
   private Node head;  //记录头节点的位置
   private Node tail;  //记录尾节点的位置
   private int length=0; //记录链表的长度

    public MyLinkedList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
    //求链表长度的方法
    public int length(){
        return this.length;
    }
    //头插的方法
    public void addFirst(int val){
        Node newNode= new Node(val);
        //如果是空链表的情况
        if (head==null){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        //非空的情况
        newNode.next=head;
        head.pre=newNode;
        head=newNode;  //更新链表的头节点
        length++;
        return;

    }
    //尾插的方法
    public void addTail(int val){
        Node newNode=new Node(val);
        //如果是空链表的情况
        if(head==null){
            head=newNode;
            tail=newNode;
            length++;
            return;
        }
        //如果是非空链表的情况
        tail.next=newNode;
        newNode.pre =tail;
        tail=newNode; //更换新的尾节点
        length++;
    }
    //指点位置插入
    public void add(int index,int val){
        //先考虑特殊情况
        if(index<0 ||index >=length){ //
           throw new RuntimeException("位置非法！！！");
        }
        if(index==0){ //如果是头插入链表
            addFirst(val);
        }
        if(index==length){ //如果是尾插入链表
            addTail(val);
        }
        //接下来就是中间的一般情况
        Node newNode=new Node(val);  //这是待插入的节点
        Node nextNode=getNode(index);// 这是待插入节点的下一个节点
        Node preNode=nextNode.pre; //这是待插入节点的前一个节点
        preNode.next=newNode;
        newNode.pre=preNode;
        //进行引用之间的地址变化
        newNode.next=nextNode;
        nextNode.pre=newNode;
        length++;
        return;
    }
    //获取指定位置的节点
    public Node getNode(int index){
        //判断位置的合法性
        if(index<0 || index>= length){
            throw new RuntimeException("位置非法！！！");
        }
        Node cur=head;
       for(int i=0;i<index;i++){  //循环遍历找到对应的节点
           cur=cur.next;
       }
       return cur;
    }
    //删除头节点
    public void removeFirst(){
        //考虑特殊情况
        if(head==null){  //如果是空链表，不需要删除，直接返回
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            length=0;
            return;
        }
        // 1  2  3
        Node nextNode=head.next;
        nextNode.pre=null;
        head=nextNode;
        length--;
        return;
    }
    public void removeLast(){
        if(head==null){ //如果是空链表
            return;
        }
        if(head.next==null){  //只有一个节点的情况
            head=null;
            tail=null;
            length=0;
            return;
        }
        // 1 2 3
        Node preNode=tail.pre;
        preNode.next=null;
        tail=preNode;
        length--;
        return;
    }
    //按位置删除
    public void removeByIndex(int index){
        if(index<0 || index >=length){
            throw new RuntimeException("位置非法！！！");
        }
        if(index==0){   //这就相当于删除头节点
            removeFirst();
            return;
        }
        if(index==length-1){ //这就相当于删除尾节点
            removeLast();
            return;
        }
        Node toDelete=getNode(index);
        Node preNode=toDelete.pre;
        Node nextNode=toDelete.next;

        preNode.next=toDelete.next;
        nextNode.pre=toDelete.pre;
        length--;
        return;

    }
    //按值删除节点
    public void removeByValue(int val){
        int index=indexOf(val);
        if(index==-1){
            throw new RuntimeException("没有该值！！！");
        }
        removeByIndex(index); //调用按位置删除的方法
    }
    //查找
    public int get(int index){
        if(index<0 ||index >=length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNode(index).val;
    }
    //修改链表节点的值
    public void set(int index,int val){
        if(index<0 || index>=length){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node node=getNode(index);
        node.val=val;
    }

    //根据值找下标的位置
    public int indexOf(int val) {
        Node cur=head;
        for(int i=0;i<length;i++){
            if (cur.val==val){
                return i;
            }
            cur=cur.next;
        }
        return -1;
    }
}

public class dateStructureMylinkedList {
    public static void main(String[] args) {
        Node head=new Node(0);
        Node Tail=new Node(0);
        MyLinkedList linked1= new MyLinkedList( head, Tail);
        int result=linked1.length();
        System.out.println("初始化链表的长度为:");
        System.out.println(result);
        linked1.addTail(3);  //尾插一个3
        int result1=linked1.length();
        System.out.println("尾部插入一个3后的长度:");
        System.out.println(result1);
        System.out.println("查看插入后的值:");
        System.out.println(linked1.getNode(0));
        System.out.println("头插入一个6");
        linked1.addFirst(6);
        System.out.println(linked1.getNode(0));
        System.out.println("将头节点的值修改10");
        linked1.set(0,10);
        System.out.println(linked1.getNode(0));
        System.out.println("删除头节点");
        linked1.removeFirst();
        System.out.println(linked1.getNode(0));
    }
}
