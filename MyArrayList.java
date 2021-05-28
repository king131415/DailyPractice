package javaDailyProctice.Test0528;


class MyArrayListIndexOutOfRangeException extends RuntimeException{
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}


public  class MyArrayList<E>{
        private int size=0;
        private E[] arr=null;
        private int capacity=100; //顺序表的最大容量

        public MyArrayList() {
            arr=(E[]) new Object[capacity];

        }
        public void realloc() {   //顺序表的扩容
            capacity=2*capacity;
            E[] newArr=(E[]) new Object[capacity];
            for(int i=0;i<arr.length;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;  //将扩容好的新数组的引用给旧的引用
        }
        public void add(E elem){ //元素的尾插
            if(size>=capacity){
                realloc();
            }
            arr[size]=elem;
            size++;
        }
        public void add(int index,E elem){ //元素插入中间位置
            if(index<0 || index>size){
                return;
            }
            if(size>=capacity){
                realloc();
            }
            for(int i=size-1;i>=index;i--){  //进行元素的搬运
                arr[i+1]=arr[i];
            }
            arr[index]=elem;
            size++;
        }
        public E remove(int index){
            if(index<0||index>=size){
                return null;
            }
            E result= arr[index];
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            return result; //返回删除的元素
        }
        public boolean remove(E elem){  //按照元素的值来删除
            int index=0;
            for(;index<size;index++){
                if(arr[index].equals(elem)){
                    break;
                }
            }
            if(index>=size ){
                return false;
            }
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            return true;
        }
        public E get(int index){ //根据下标获取元素
            if(index<0 ||index >=size){
                throw new MyArrayListIndexOutOfRangeException("下标越界了！");
            }
            return arr[index];
        }
        public  void set(int index,E elem){
            if(index<0 || index>=size){
                throw new MyArrayListIndexOutOfRangeException("下标越界了");
            }
            arr[index]=elem;
        }
        public boolean contains(E elem){ //判断是否包含某个元素
            for(int i=0;i<size;i++){
                if(arr[i].equals(elem)){
                    return true;
                }
            }
            return false;
        }
        public int indeof(E elem){
            for(int i=0;i<size;i++){
                if(arr[i].equals(elem)){
                    return i;
                }
            }
            return -1;//没找到返回一个非法的位置
        }
        public int lastIndexOf(E elem){
            for(int i=size-1;i>=0;i--){
                if(arr[i].equals(elem)){
                    return i;
                }
            }
            return -1;
        }
        public void clear(){
            size=0;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
}
