public class QueueLinkedListBinaryNode {

    Node head;
    Node last;

    private class Node {
        BinaryNode item;
        Node next;

        private Node(BinaryNode item, Node nextNode) {
            this.item = item;
            this.next = nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.next = nextNode;
        }

        public Node getNext() {
            return this.next;
        }

        public BinaryNode getItem() {
            return this.item;
        }

    }

    public QueueLinkedListBinaryNode() {
        this.head = null;
        this.last = null;
    }

    public void add(BinaryNode item) {
        if (this.head == null) {
            this.head = new Node(item, null);
            this.last = this.head;
        } else {
            this.last.setNextNode(new Node(item, null));
            this.last = this.last.getNext();
        }
    }

    public BinaryNode remove() {
        BinaryNode currentFirst = this.head.getItem();
        this.head = this.head.getNext();
        return currentFirst;
    }

    public void printQueue(Node printNode, int CurrentPosition) {
        System.out.println("Current Position :"
                + CurrentPosition + "| Current Value:" + printNode.getItem().getValue() +
                "| Current Key:" + printNode.getItem().getKey());
        if (printNode.getNext() != null) {
            printQueue(printNode.getNext(), CurrentPosition + 1);
        }
        if (printNode == head) {

            System.out.println();
        }
    }

}
