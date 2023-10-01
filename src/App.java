public class App {
    public static void main(String[] args) throws Exception {
        // linkedListQueueTest();
        // LinkedListQueueBinaryTreeTest();
        arraryQueueTest();
    }

    public static void linkedListQueueTest() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.add(1);
        queue.add(2);
        queue.printQueue(queue.head, 1);
        queue.add(3);
        queue.printQueue(queue.head, 1);
        queue.remove();
        queue.printQueue(queue.head, 1);
    }

    public static void LinkedListQueueBinaryTreeTest() {
        BinaryTree tree = new BinaryTree();
        tree.add(0, 0);
        tree.add(1, 1);
        tree.add(3, 3);
        tree.add(-1, -1);
        tree.root.print();

        TreeIteratorQueue iterator = new TreeIteratorQueue(tree.getRoot());
        System.out.println(iterator.next.getValue());
        iterator.next();
        System.out.println(iterator.next.getValue());
        iterator.next();
    }

    public static void arraryQueueTest() {

        QueueArray queue = new QueueArray(4);

        System.out.println("Queue length " + queue.QueueArray.length);

        int length = queue.QueueArray.length;

        for (int i = 0; i < length; i++) {
            queue.add(i);
        }
        queue.printQueue();
        System.out.println("Queue length " + queue.QueueArray.length);
        System.out.println("First " + queue.first);
        System.out.println("Last " + queue.last);


        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(12);
        queue.printQueue();
        System.out.println("First " + queue.first);
        System.out.println("Last " + queue.last);


        System.out.println("ADAWd");
    }
}
