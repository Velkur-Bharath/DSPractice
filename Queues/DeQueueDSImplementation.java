package Queues;

class Dequeue{
    int forward_pointer=0;
    int rear_pointer=-1;
    int[] Array_Queue = new int[5];

    void insert_rear(int element){
        if(rear_pointer>=5){
            System.out.println("Queue is full!");
            return;
        }
        else{
            rear_pointer++;
            Array_Queue[rear_pointer]=element;
        }
        return;
    }

    void delete_front(){
        if(forward_pointer<=4){
            Array_Queue[forward_pointer]=0;
            forward_pointer++;
            return;
        }
    }

    void insert_front(int element){
        if(rear_pointer>=5){
            System.out.println("Queue is full!");
            return;
        }
        if(rear_pointer==-1){
            rear_pointer++;
            Array_Queue[rear_pointer]=element;
        }
        else if(forward_pointer<5){
            forward_pointer--;
            Array_Queue[forward_pointer]=element;
        }
        return;
    }

    void delete_rear(){
        if(rear_pointer!=-1){
            Array_Queue[rear_pointer]=0;
            rear_pointer--;
            return;
        }
        else
            System.out.print("Queue is Empty!");
    }

    void view(){
        for (int i = forward_pointer; i <=rear_pointer; i++) {
            System.out.print(Array_Queue[i]+" ");
        }
    }
}

public class DeQueueDSImplementation {
    public static void main(String[] args) {
        Dequeue new_queue=new Dequeue();

        new_queue.insert_rear(5);
        new_queue.insert_rear(5);
        new_queue.view();
        new_queue.delete_front();
        new_queue.insert_front(4);
        new_queue.view();
        new_queue.delete_rear();
        new_queue.view();
    }
}
