package Day06;

public class smallest {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 3, 9};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}
