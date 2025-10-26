package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<>();
		
		//Enqueue (Add elements to the REAR)
		queue.add("Task 1");
		queue.add("Task 2");
		queue.add("Task 3");
		System.out.println("Queue Elements: " + queue);
		
		//Peek (View the element at the FRONT without removal)
		String nexTask = queue.peek();
		System.out.println("Next Task to process: " + nexTask);
		
		//Dequeue (Remove elements from the FRONT)
		String processedTask = queue.poll();
		System.out.println("Completed : " + processedTask);
		System.out.println("Queue after poll 1 : " + queue);

		//Dequeue (Remove elements again from the FRONT)
		String processedTask1 = queue.poll();
		System.out.println("Completed : " + processedTask1);
		System.out.println("Queue after poll 2 : " + queue);
			
	}

}
