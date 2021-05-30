package javaDailyProctice.Test0530;

class MyExciption extends RuntimeException{
    public MyExciption(String msg) {
        super(msg);
    }
}

class Node<T>{
    T var;
    Node<T> pre;
    Node<T> next;

    public Node(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Node{" +
                "var=" + var +
                '}';
    }
}

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    //入队列  1  2   3
    public void offer(T var){
        Node<T> newNode=new Node<>(var);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        //一般情况 1 2 3
        tail.next=newNode;
        newNode.pre=tail;
        tail=newNode;
        size++;
        return;

    }
    //入队列
    public void add(T var){
        Node<T> newNode=new Node<>(var);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        //一般情况 1 2 3
        tail.next=newNode;
        newNode.pre=tail;
        tail=newNode;
        size++;
        return;

    }
    //出队列
    public void poll(){
        if(head==null){
            return ;
        }
        if(head.next==null){
            head=null;
            tail=null;
            size--;
            return;
        }
        //一般情况 1   2   3
        Node<T> curNode=head;
        Node<T> nextNode=curNode.next;
        nextNode.pre=null;
        head=nextNode;
        size--;
        return;

    }
    //出队列
    public void remove(){
        if(head==null){
            throw new MyExciption("位置非法！！！");
        }
        if(head.next==null){
            head=null;
            tail=null;
            size--;
            return;
        }
        //一般情况 1  2  3
        Node<T> curNode=head;
        Node<T> nextNode=curNode.next;
        nextNode.pre=null;
        head=nextNode;
        size--;
        return;

    }
    //判断是否为空队列
    public boolean isEmpty(){
        return size<=0;

    }
    //取队首元素
    public T peek(){
        if(head==null){
            return null;
        }
        return (T)head;
    }
    //取队首元素
    public T element(){
        if(head==null){
            throw new MyExciption("空指针异常！！！");
        }
        return (T)head;
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        myQueue.poll();
        System.out.println(myQueue.element());
        System.out.println(myQueue.isEmpty());

    }
}
