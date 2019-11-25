package overl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunCmdCommand {

	public static void main(String[] args) throws Exception {

		ProcessBuilder pb = new ProcessBuilder();
		pb.command("cmd.exe", "/c", "ping 127.0.0.1");

		Process process = pb.start();

		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		int exitCode = process.waitFor();
		System.out.println("\nExited with error code : " + exitCode);

	}
}

Output:
Pinging 127.0.0.1 with 32 bytes of data:
Reply from 127.0.0.1: bytes=32 time<1ms TTL=128
Reply from 127.0.0.1: bytes=32 time<1ms TTL=128
Reply from 127.0.0.1: bytes=32 time<1ms TTL=128
Reply from 127.0.0.1: bytes=32 time<1ms TTL=128

Ping statistics for 127.0.0.1:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms

Exited with error code : 0
