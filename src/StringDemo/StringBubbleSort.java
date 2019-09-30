package lectures;

public class StringBubbleSort {
	public static void main(String[] args) {
		String state[] = { "Florida", "North Dakota", "Delaware", "Georgia", "Arkansas", "Illinois", "Colorado", "Utah",
				"Texas", "Wyoming", "Rhode Island", "Virginia", "Hawaii", "Louisiana", "Oregon", "Kansas", "Michigan",
				"Kentucky" };
		String temp;
		System.out.println("States in sorted (asc) order:");
		for (int j = 0; j < state.length; j++) {
			for (int i = j + 1; i < state.length; i++) {

				if (state[i].compareTo(state[j]) < 0) {
					temp = state[j];
					state[j] = state[i];
					state[i] = temp;
				}
			}
			System.out.println(state[j]);
		}
	}
}


Output:
States in sorted (asc) order:
Arkansas
Colorado
Delaware
Florida
Georgia
Hawaii
Illinois
Kansas
Kentucky
Louisiana
Michigan
North Dakota
Oregon
Rhode Island
Texas
Utah
Virginia
Wyoming
