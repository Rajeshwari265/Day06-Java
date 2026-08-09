package Day06;

public class count {

	public static void main(String[] args) {
		int[] arr = {2, 3, 2, 3, 2, 5};

        int search = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
