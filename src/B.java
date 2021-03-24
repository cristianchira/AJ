
public class B extends Thread {

	@Override
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("Thread from class B's name= " + Thread.currentThread().getName());
		 
		  
	 
	}

	
	
}
