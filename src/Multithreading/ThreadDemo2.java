package mutlithread;

public class ThreadDemo2 implements Runnable {

public static void main(String[] args) {
ThreadDemo2 td2 = new ThreadDemo2();
td2.run();

}

public void run() {
System.out.println("A thread is running");

}

}
