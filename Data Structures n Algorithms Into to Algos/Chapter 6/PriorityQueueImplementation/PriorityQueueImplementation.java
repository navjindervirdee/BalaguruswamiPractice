public class PriorityQueueImplementation{
	public static void main(String [] args){
		PriorityQueue queue = new PriorityQueue(10);
		try{
			queue.insert(12);
			queue.insert(56);
			queue.insert(34);
			queue.insert(90);
			queue.insert(5);
			System.out.println("Max Value is : " + queue.getMax());
			queue.changePriority(0,100);
			System.out.println("Extracted Value : " + queue.extractMax());
			
			queue.insert(1);
			queue.insert(90);
			queue.remove(0);
			System.out.println("Max value is : " + queue.getMax());
			queue.changePriority(4,70);
			System.out.println("Extracted Value : " +  queue.extractMax());
			
			queue.insert(4);
			System.out.println("Max value is : " + queue.getMax());
			System.out.println("Extracted Value : " +  queue.extractMax());
			System.out.println("Extracted Value : " +  queue.extractMax());
			System.out.println("Extracted Value : " +  queue.extractMax());								System.out.println("Extracted Value : " +  queue.extractMax());
			System.out.println("Extracted Value : " +  queue.extractMax());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}





	