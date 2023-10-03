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

        QueueArray[last] = item;
        last = (last + 1) % QueueArray.length;

        if (first == last) {
            expandQueueArray();
        }

    }

    public Integer remove() {
        if (first == last) {
            return null;
        }
        Integer i = QueueArray[first];

        QueueArray[first] = null;
        first = (first + 1) % QueueArray.length;
        if (i == null) {
            first = 0;
            last = 0;
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
        for (int i = 0; i < last; i++) {
            newQueueArray[currentCopiedElement] = QueueArray[i];
            currentCopiedElement++;
        }

        last = currentCopiedElement;
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
            System.out.println("First Position : " + position + "| Value: " + QueueArray[i]);
            position += 1;

        }
        if (last < first) {
            for (int i = 0; i < first; i++) {
                /*
                 * if (QueueArray[i] == null) {
                 * break;
                 * }
                 */
                System.out.println("Last Position : " + position + "| Value: " + QueueArray[i]);
                position += 1;

            }
        }

        System.out.println("");
    }
}
