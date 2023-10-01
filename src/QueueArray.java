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
            if (last >= QueueArray.length - 1) {
                last = 0;
            }
            if (first == last) {
                expandQueueArray();
            }
        }
    }

    public Integer remove() {
        Integer i = QueueArray[first];
        QueueArray[first] = null;
        first++;
        if (first == QueueArray.length - 1) {
            first = 0;
        }
        if (first == last) {
            expandQueueArray();
        }
        return i;
    }

    public void expandQueueArray() {
        Integer newQueueArray[] = new Integer[QueueArray.length * 2];
        for (int i = first; i < QueueArray.length; i++) {
            newQueueArray[i] = QueueArray[i];

        }
        first = 0;
        for (int i = last; i < first; i++) {
            newQueueArray[i] = QueueArray[i];

        }

        last = QueueArray.length;
        this.QueueArray = newQueueArray;
    }

    public void printQueue() {

        int position = 1;
        for (int i = first; i < QueueArray.length; i++) {
            if (QueueArray[i] == null) {
                break;
            }
            System.out.println("Position : " + position + "| Value: " + QueueArray[i]);
            position += 1;

        }
        for (int i = last; i < first; i++) {
            if (QueueArray[i] == null) {
                break;
            }
            System.out.println("Position : " + position + "| Value: " + QueueArray[i]);
            position += 1;

        }
        System.out.println("");
    }
}
