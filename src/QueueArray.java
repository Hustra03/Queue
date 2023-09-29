public class QueueArray {

    Integer[] QueueArray;
    int first;
    int last;

    public QueueArray(int initialArrayLength) {
        this.QueueArray = new Integer[initialArrayLength];
        this.first = 0;
        this.last = 0;
    }

    public void add(Integer item) {
        if (this.last < QueueArray.length) {
            QueueArray[last] = item;
            last++;
            if (last == QueueArray.length - 1) {
                last = 0;
            }
            if (first == last) {
                expandQueueArray();
            }
        } else {
        }
    }

    public Integer remove() {
        Integer i = QueueArray[first];
        QueueArray[first] = null;
        first++;
        if (first == QueueArray.length - 1) {
            first = 0;
        }
        return i;
    }

    private void expandQueueArray() {
        Integer newQueueArray[] = new Integer[QueueArray.length * 2];
        for (int i = first; i < QueueArray.length; i++) {
            newQueueArray[i] = QueueArray[i];

        }
        first = 0;
        for (int i = last; i < first; i++) {
            newQueueArray[i] = QueueArray[i];

        }
        last = 0;
    }
}
