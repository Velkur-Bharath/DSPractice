package Queues;

class Queue{ //Queue base class
    int forward_pointer=0;
    int rear_pointer=-1;
    int[] Array_Queue= new int[5];
    int index=0;

    void insert_rear(int element){
        if(rear_pointer>=5){
            System.out.println("Queue is full!");
            return;
        }
        else if(forward_pointer>rear_pointer&&rear_pointer<4){
            rear_pointer++;
            Array_Queue[0]= element;
            return;
        }
        rear_pointer++;
        Array_Queue[rear_pointer]=element;
        return;
    }

    void delete_front(){
        if(forward_pointer<=4){
            Array_Queue[forward_pointer]=0;
            forward_pointer++;
            return;
        }
        else{
            System.out.println("Queue is empty. Resetting..");
            forward_pointer=0;
            rear_pointer=-1;
        }
        return;
    }

    void view(){
        for(int i=0;i<5;i++)
            System.out.println(Array_Queue[i]);
    }

}

public class QueueDSImplementation {

    public static void main(String[] args){
        Queue new_queue= new Queue();

        new_queue.insert_rear(10);
        new_queue.insert_rear(20);
        new_queue.insert_rear(30);
        new_queue.insert_rear(40);
        new_queue.insert_rear(50);
        new_queue.view();

        new_queue.delete_front();
        new_queue.view();
        new_queue.delete_front();
        new_queue.view();
        new_queue.delete_front();
        new_queue.view();
        new_queue.delete_front();
        new_queue.view();
        new_queue.delete_front();
        new_queue.view();
        new_queue.delete_front();

        new_queue.insert_rear(60);
        new_queue.insert_rear(70);
        new_queue.insert_rear(80);
        new_queue.insert_rear(90);
        new_queue.insert_rear(100);
        new_queue.view();

    }
}
