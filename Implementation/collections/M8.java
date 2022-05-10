package collections;

import java.util.PriorityQueue;

public class M8
{

	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		queue.add(190);
		queue.add(290);
		queue.add(790);
		queue.add(10);
		queue.add(2);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}