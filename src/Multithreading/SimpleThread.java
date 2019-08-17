package mutlithread;

public class SimpleThread {

public static void main(String[] args) throws InterruptedException {

Thread t = Thread.currentThread();
System.out.println("Current Thread: "+ t.getName());
t.setName("My First Thread!");
System.out.println("Current Thread with changed name: "+ t.getName());

t.sleep(500);
}

}
