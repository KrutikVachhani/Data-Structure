public class CircularQueue {
    int[] arr=new int[5];
    int front = -1;
    int rear = -1;


    int temp = 0;

    public void enqueue(int n) {
        int temp = (rear + 1) % (arr.length);
        if (temp == front) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = temp;
            arr[rear] = n;
        }
    }

    public int dequeue() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int temp = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % (arr.length);
            }
            return temp;
        }
    }

    public void display() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
        } else {
            int i = front;
            System.out.println("front : " + front);
            System.out.println("rear : " + rear);
            System.out.print("Items : ");
            while (i != rear) {
                System.out.print("[" + arr[i] + "] ");
                i = (i + 1) % (arr.length);
            }
            System.out.println("[" + arr[rear] + "] ");
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        CircularQueue queue = new CircularQueue();
        

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(25);
        queue.display();
        
    }
}