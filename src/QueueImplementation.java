import java.util.*;
import java.io.*;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.toString());


    }
}
class Queue{
    int[] q;
    int front=0,rear=0,size=0;
    static final int capacity=6;
    Queue(){
        q=new int[capacity];
        front=0;
        rear=0;
        size=0;
    }
    public Queue(int capacity){
        q=new int[capacity];
    }
    public void enqueue(int val) throws NullPointerException,IllegalStateException{
        if(size==capacity){
            throw new IllegalStateException("Queue overflow");
        }
        else{
            size++;
            q[rear]=val;
            rear=(rear+1)%capacity;
        }
    }
    public int dequeue() throws NullPointerException,IllegalStateException{
        if(size==0){
            throw new IllegalStateException("Queue Underflow");
        }
        else{
            size--;
            int data=q[front];
            q[front]=Integer.MIN_VALUE;
            front=(front+1)%capacity;
            return data;
        }

    }
    public String toString(){
        String res="[";
        for(int i=0;i<size;i++){
            res+=Integer.toString(q[(front+i)%capacity]);
            if(i<size-1){
                res+=",";
            }
        }
        res+="]";
        return res;
    }
}