//import java.util.LinkedList;
//
//public class PriorityQueue<T> {
//
//    private int size = 0;
//
//    private PriorityQueue[] queue = new PriorityQueue[3];
//
//    private Node<T> first;
//
//    private Node<T> last;
//
//    public PriorityQueue(int size, Node<T> first, Node<T> last) {
//        this.size = size;
//        this.first = first;
//        this.last = last;
//    }
//
//    public void add(int index, T element, int priority) {
//        switch (priority) {
//            case (1):
//                if (index == size)
//                    linkLast(element);
//                else
//                    linkBefore(element, node(index));
//                break;
//            case (2):
//                if (index == size)
//                    linkLast(element);
//                else
//                    linkBefore(element, node(index));
//                break;
//            case (3):
//                if (index == size)
//                    linkLast(element);
//                else
//                    linkBefore(element, node(index));
//                break;
//        }
//    }
//
//    void linkLast(T t, int priority) {
//        switch (priority) {
//            case (1):
//                final Node<T> l = last;
//                final Node<T> newNode = new Node<>(l, t, null);
//                last = newNode;
//                if (l == null)
//                    first = newNode;
//                else
//                    l.next = newNode;
//                size++;
//        }
//    }
//
//    void linkBefore(T t, Node<T> succ) {
//        // assert succ != null;
//        final Node<T> pred = succ.prev;
//        final Node<T> newNode = new Node<>(pred, t, succ);
//        succ.prev = newNode;
//        if (pred == null)
//            first = newNode;
//        else
//            pred.next = newNode;
//        size++;
//    }
//
//
//    Node<T> node(int index) {
//
//        if (index < (size >> 1)) {
//
//            Node<T> x = first;
//            for (int i = 0; i < index; i++)
//                x = x.next;
//            return x;
//        } else {
//
//            Node<T> x = last;
//            for (int i = size - 1; i > index; i--)
//                x = x.prev;
//            return x;
//        }
//    }
//
//    public boolean add(T t) {
//        linkLast(t);
//        return true;
//    }
//
//
//    LinkedList
//
//    private static class Node<T> {
//        T item;
//        Node<T> next;
//        Node<T> prev;
//
//        Node(Node<T> prev, T element, Node<T> next) {
//            this.item = element;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//}
//
