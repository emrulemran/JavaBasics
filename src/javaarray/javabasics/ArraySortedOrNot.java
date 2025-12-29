package arraydemo;

public class ArraySortedOrNot {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};//13 //1,5,8,9

        boolean flag = true;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) { //9>8
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("sorted");

        } else {
            System.out.println("not sorted");
        }
    }
}
