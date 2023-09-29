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
    }

    public void add(Integer item) {
        if (this.head == null) {
            this.head = new Node(item, null);
            this.last = this.head;
        } else {
            //For implementation without last node pointer
            Node currentPosition = this.head;
            while (currentPosition.next != null) {
                currentPosition = currentPosition.next;
            }
            currentPosition.setNextNode(new Node(item, null));
        }
        //For implementation with last node pointer
        this.last.setNextNode(new Node(item, null));
        this.last = this.last.getNext();
    }

    public Integer remove() {
        Integer currentFirst = this.head.getItem();
        this.head = this.head.next;
        return currentFirst;
    }

}
