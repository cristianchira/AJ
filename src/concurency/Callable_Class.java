package concurency;

import java.util.ArrayList;
import collections.List;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_Class {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// create the pool
		ExecutorService service = Executors.newFixedThreadPool(10);

		// submit the tasks for execution
		List<Future> allFuture = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = service.submit(new Task());
			allFuture.add(future);
		}

		// 100 futurer with 100 placeholders

		// perform some unrelated operations

		// 100 sec
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = allFuture.get(i);
			Integer result = future.get(); // blocking operations
			System.out.println("Result of future #" + i + "=" + result);
		}
	}

	static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(3000);
			return new Random().nextInt();
		}

	}
}
