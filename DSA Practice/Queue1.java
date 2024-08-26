
public class Queue1 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // constructor
        Queue(int size) {
            // size we have declared that will also be assign to array
            arr = new int[size];
            this.size = size;
        }

        // check whether queue is empty or not
        public boolean isEmpty() {
            return rear == -1;
        }

        // Enque Function(add) TC= O(1)

        public void add(int data) {
            // check queue if full or not.
            // If rear is at n-1/size-1 index after storing n elements then queue is full
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            // in array where rear is pointing place the data at that empty index
            arr[rear] = data;
        }

        // dequeue Function(remove)
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            // Queue front is at 0th index of array
            // To remove element we have to access 0th index

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return front;
        }

        // Peeek function

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

        // Main function

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }

    }

}
