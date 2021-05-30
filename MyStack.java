package javaDailyProctice.Test0530;


public class MyStack<T> {
    private T[] arr=null;
    private int size;
    private int capacity=5;

    public MyStack() {
        arr= (T[]) new Object[capacity];
        this.size=0;
    }
    //入栈
    public void push(T var){
        if(size==capacity){ //判断栈是否满了
            //栈满了就扩容
           T[] newarr= (T[]) new Object[2*capacity];
            for(int i=0;i<size;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
            arr[size++]=var;
            return;
        }
        arr[size++]=var;
        return;
    }
    //出栈
    public void pop(){
        if(empty()){ //空栈
            return;
        }
        size--;
        return;

    }
    //查看栈顶元素
    public T peek(){
        if(empty()){
            return null;
        }
        return (T)arr[size-1];

    }
    //判断栈是否为空
    public boolean empty(){
        if (size==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack=new MyStack<>();
        System.out.println(myStack.empty());
        myStack.push(1); //入栈
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6); //触发扩容
        myStack.pop();
        myStack.pop();
        Integer result = myStack.peek();
        System.out.println(result);
        System.out.println(myStack.empty());

        System.out.println("============");
        MyStack<String> myStack1=new MyStack<>();
        System.out.println(myStack1.empty());
        myStack1.push("C++");
        myStack1.push("java");
        myStack1.push("Go");
        System.out.println(myStack1.peek());
    }
}
