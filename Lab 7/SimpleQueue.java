import java.util.*;
public class SimpleQueue {
    int arr[]=new int[100];
    int front = -1;
    int rear = -1;

    

    public void enqueue(int n) {
        if (rear >= arr.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            if (rear == 0) {
                front = 0;
            }
            arr[rear] = n;
        }
    }

    public int dequeue() {
        if (front <= -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            System.out.println("Dequeued element");
            return arr[front++];
        }
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SimpleQueue queue = new SimpleQueue();

        queue.enqueue(25);
        queue.enqueue(15);
        queue.enqueue(5);
        queue.dequeue();
        queue.display();


        sc.close();
    }
}
