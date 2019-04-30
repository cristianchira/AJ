package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_Class {

	public static void main(String[] args) {

		// get count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);

		// create pool
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		// submit the tasks for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}

	}

	static class CpuIntensiveTask implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("CpuIntensive run...");

		}

	}

	static class Task extends Thread {

		@Override
		public void run() {
			System.out.println("Thread name " + Thread.currentThread().getName());

		}
	}

}
