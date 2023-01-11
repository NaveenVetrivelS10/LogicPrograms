package java8;
//Implements the thread concepts using lanbda Expreisson
public class LambdaWithThread {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++)
			{
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Child Thread=" + i);
				
			}
		};
		Thread t = new Thread(r);
		t.setName("Implementing the lambda");
		System.out.println(t.getName());
		t.start();
		
	}

}
