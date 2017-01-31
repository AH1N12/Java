package Threads;

public class SingleThread extends Thread {

	String name;

	public SingleThread(String n) {
		name = n;
	}

	public void run() {

		
		for (int i = 0; i < 10; i++) {
			System.out.println("thread " + name + " iteration: " + i);
			try {
				Thread.currentThread().sleep(1000);
				
			} catch (InterruptedException e) {
			}
		}
	}
}
