package tesdemo;

import java.lang.management.ManagementFactory;

public class ProcessID {

	public static void main(String[] args) {
		String name = ManagementFactory.getRuntimeMXBean().getName();
		System.out.println(name);
		String pid = name.split("@")[0];
		System.out.println("Process ID: " + pid);
	}
}
