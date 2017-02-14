package javaarray;

public class ArrayIntro {
    public static void main(String[] args) {
        int abc[];
        abc = new int[4];
        abc[0] = 10;
        abc[1] = 20;
        System.out.println(abc[0] + abc[1]);

        // the dafault value of an array element is 0
        int[] def = new int[4];
        def[0] = 20;
        def[1] = 30;
        def[1] = 30;
        System.out.println(def[1] + def[3]);

        int[] nums = {1, 4, 6, 7, 8, 4, 2, 1};
        System.out.println(nums[2] + nums[3]);

        char[] alphabets = {'A', 'D', 'Z', 'C', 'V', 'S'}; // array of characters
        byte[] bytes = {12, 3, 4, 6, 7, 8, 7}; // array of bytes
        float[] floats = {1.2f, 3.4f, 5.6f, 7.1f}; // array of floats
        boolean[] booleans = {true, true, false, true, false, false};
        String[] names = {"New York", "Denver", "Hawaii", "Miami", "Ohio"};
        double[] doubles = {2.1, 3.4, 5.6, 6, 9.1};
        short[] shorts = {2, 4, 6, 8, 9, 0};
        int[] ints = {1, 4, 6, 7, 8, 4, 2, 1};

    }
}
