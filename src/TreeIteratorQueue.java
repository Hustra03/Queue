import java.util.Iterator;

public class TreeIteratorQueue implements Iterator<Integer> {
    public BinaryNode next;
    private QueueLinkedListBinaryNode queue;

    public TreeIteratorQueue(BinaryNode root) {
        this.next = root;
        this.queue = new QueueLinkedListBinaryNode();
        queue.add(next);
    }

    @Override
    public boolean hasNext() {
        if (queue.head == null) {
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {

        if (queue.head == null) {

            next = queue.remove();

            if (next.getLeftBinaryNode() != null) {
                queue.add(next.getLeftBinaryNode());
            }
            if (next.getRightBinaryNode() != null) {
                queue.add(next.getRightBinaryNode());
            }
            Integer Integer = next.getValue();
            return Integer;
        } else {
            return -1;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
