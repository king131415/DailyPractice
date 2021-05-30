package javaDailyProctice.Test0530;


import java.util.LinkedList;
import java.util.Queue;
public class Test0530 {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.offer(2);

        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.poll();
        queue.remove();

        System.out.println(queue.isEmpty());

    }
}
