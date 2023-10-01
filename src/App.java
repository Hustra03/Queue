public class App {
    public static void main(String[] args) throws Exception {
        // linkedListQueueTest();
        LinkedListQueueBinaryTreeTest();
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
        for (int i = 1; i < 5; i++) {
            
        tree.add(i, i);
        }
        tree.root.print();

        TreeIterator iterator = new TreeIterator(tree.getRoot());
        System.out.println(iterator.next.getValue());
        iterator.next();
        System.out.println(iterator.next.getValue());
        iterator.next();
    }

    public static void arraryQueueTest() {
    }
}
