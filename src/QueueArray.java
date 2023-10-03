public class QueueArray {

    Integer[] QueueArray;
    int first;
    int last;

    public QueueArray(int initialArrayLength) {
        this.QueueArray = new Integer[initialArrayLength];
        this.first = 0;
        this.last = 0;
    }

    public void add(Integer item) throws Exception {
        if (this.last < QueueArray.length) {
            QueueArray[last] = item;
            last++;
            if (last >= QueueArray.length - 1) {
                last = 0;
            }
            if (first == last) {
                expandQueueArray();
            }
        } else {
            throw new Exception();
        }
    }

    public Integer remove() {
        Integer i = QueueArray[first];
        if (i != null) {

            QueueArray[first] = null;
            first++;
            if (first == QueueArray.length - 1) {
                first = 0;
            }
        }

        return i;
    }

    public void expandQueueArray() {
        Integer newQueueArray[] = new Integer[QueueArray.length * 2];
        int currentCopiedElement = 0;
        for (int i = first; i < QueueArray.length; i++) {
            newQueueArray[i] = QueueArray[i];
            currentCopiedElement++;
        }
        first = 0;
        for (int i = last; i < first; i++) {
            newQueueArray[currentCopiedElement+last] = QueueArray[i];
        }

        last = QueueArray.length - 1;
        this.QueueArray = newQueueArray;
    }

    public void printQueue() {

        int position = 1;
        for (int i = first; i < QueueArray.length; i++) {
            /*
             * if (QueueArray[i] == null) {
             * break;
             * }
             */
            System.out.println("Position : " + position + "| Value: " + QueueArray[i]);
            position += 1;

        }
        for (int i = last; i < first; i++) {
            /*
             * if (QueueArray[i] == null) {
             * break;
             * }
             */
            System.out.println("Position : " + position + "| Value: " + QueueArray[i]);
            position += 1;

        }
        System.out.println("");
    }
}
