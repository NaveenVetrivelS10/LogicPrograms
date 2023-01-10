package logicPros;
//Implement the queue Concepts FIFO
public class QueueArrayImplementation {  
    public static void main(String[] args) {   
        
        Queue q = new Queue(4);   
     
        System.out.println("Initial Queue:");  
     
        q.queueDisplay();   
     
        
        q.queueEnqueue(10);   
        q.queueEnqueue(30);   
        q.queueEnqueue(50);   
        q.queueEnqueue(70);   
        
      
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay();   
        
       
        q.queueFront();   
        
           
        q.queueEnqueue(90);   
        
           
        q.queueDisplay();   
        
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf("\nQueue after two dequeue operations:");   
        
          
        q.queueDisplay();   
        	
          
        q.queueFront();   
    }   
}  
