public class QueueLinkedList {

    Node head;
    Node last;

    private class Node {
        Integer item;
        Node next;

        private Node(Integer item, Node nextNode) {
            this.item = item;
            this.next = nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.next = nextNode;
        }

        public Node getNext() {
            return this.next;
        }

        public Integer getItem() {
            return this.item;
        }

    }

    public QueueLinkedList() {
        this.head = null;
        this.last = null;
    }

    public void add(Integer item) {
        if (this.head == null) {
            this.head = new Node(item, null);
            this.last = this.head;
        } else {
            // For implementation without last node pointer
            
              Node currentPosition = this.head;
              while (currentPosition.next != null) {
              currentPosition = currentPosition.next;
              }
              currentPosition.setNextNode(new Node(item, null));
             
            // For implementation with last node pointer
            this.last.setNextNode(new Node(item, null));
            this.last = this.last.getNext();
        }

    }

    public Integer remove() {
        Integer currentFirst = this.head.getItem();
        if (this.head != null) {
            this.head = this.head.next;
        }
        if (this.head == this.last) {
            last = null;
        }
        return currentFirst;
    }

    public void printQueue(Node printNode, int CurrentPosition) {
        System.out.println("Current Position :" + CurrentPosition + "| Current Value:" + printNode.getItem());
        if (printNode.getNext() != null) {
            printQueue(printNode.getNext(), CurrentPosition + 1);
        }

        if (printNode == head) {

            System.out.println();
        }
    }

}
