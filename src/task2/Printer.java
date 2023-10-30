package task2;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public T first() {
        return list.peek();
    }

    public LinkedList<T> getElements() {
        return list;
    }

}

public class Printer {
    public static void main (String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }
        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
