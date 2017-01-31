package Threads;

public class StartThreads {

	public static void main(String[] args) {
		 new SingleThread("A").start();
		 new SingleThread("B").start();
		 new SingleThread("C").start();
		 new SingleThread("D").start();

	}

}
