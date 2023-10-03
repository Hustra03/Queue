import java.util.Iterator;

public class TreeIteratorQueue implements Iterator<Integer> {
    public BinaryNode next;
    private QueueLinkedListBinaryNode queue;

    public TreeIteratorQueue(BinaryNode root) {

        this.queue = new QueueLinkedListBinaryNode();
        queue.add(root);
        next = root;
    }

    @Override
    public boolean hasNext() {
        if (queue.head == null && next == null) {
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {

        if (queue.head != null && next != null) {

            if (next.getLeftBinaryNode() != null) {
                queue.add(next.getLeftBinaryNode());
            }
            if (next.getRightBinaryNode() != null) {
                queue.add(next.getRightBinaryNode());
            }
            next = queue.remove();

            Integer Integer = next.getValue();
            return Integer;
        } else {
            next = null;
            return -1;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
