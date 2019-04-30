package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOConcurency {

	public static void main(String[] args) {

		// much higher task for IOTask
		ExecutorService service = Executors.newFixedThreadPool(100);
		
		// submit the tasks for executions
		for (int i = 0; i < 100; i++) {
			service.execute(new IOTask());
		}

	}

	static class IOTask implements Runnable {

		@Override
		public void run() {
			// some IO operations which will cause thread to block/wait

		}

	}
}
