package src.Collections;

import java.util.Queue;
//PriorityQueue stores the element in natural ordering
public class PriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> q=new java.util.PriorityQueue<Integer>();
        q.offer(12);
        q.add(13);
        q.add(17);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
