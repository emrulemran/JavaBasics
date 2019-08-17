package mutlithread;

public class RerunningAThread extends Thread {
	public void run() {
		System.out.println("thread is running now ...");
	}

	public static void main(String args[]) {
		RerunningAThread t1 = new RerunningAThread();
		t1.start();
		t1.start();
	}
}


Output:
Exception in thread "main" java.lang.IllegalThreadStateException
thread is running now ...
	at java.lang.Thread.start(Unknown Source)
	at mutlithread.RerunningAThread.main(RerunningAThread.java:11)
