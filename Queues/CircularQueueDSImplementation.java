package Queues;

class CircularQueue{
    int forward_pointer=0;
    int rear_pointer=-1;
    int[] Array_Queue = new int[5];
    int count=0;

    void insert_rear(int element){
        if(count<=5){
            count++;
            rear_pointer=(rear_pointer+1)%5;
            Array_Queue[rear_pointer]=element;
            return;
        }
        else{
            System.out.println("Queue is full! delete elemets to add new..");
            return;
        }
    }

    void delete_front(){
        if(count==0){
            System.out.println("Queue is empty! add new elemets..");
            return;
        }
        else{
            count--;
            System.out.println(Array_Queue[forward_pointer]+" is deleted!");
            Array_Queue[forward_pointer]=0;
            forward_pointer=(forward_pointer+1)%5;
        }
    }

    void view(){
        int j=forward_pointer;
        for(int i=0;i<count;i++){
            System.out.println(Array_Queue[j]);
            j=(j+1)%5;
        }
    }
}

public class CircularQueueDSImplementation {
    public static void main(String[] args) {
        CircularQueue new_queue=new CircularQueue();

        new_queue.insert_rear(45);
        new_queue.insert_rear(56);
        new_queue.insert_rear(44);
        new_queue.insert_rear(89);
        new_queue.insert_rear(90);
        new_queue.view();

        new_queue.delete_front();

        new_queue.view();
        new_queue.delete_front();

        new_queue.view();

        new_queue.insert_rear(88);
        new_queue.view();

        new_queue.insert_rear(44);
        new_queue.view();
    }

}
