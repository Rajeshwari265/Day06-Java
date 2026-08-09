package Day06;

public class largest {

	public static void main(String[] args) {
		int[] arr = {4, 9, 2, 5, 1};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}
