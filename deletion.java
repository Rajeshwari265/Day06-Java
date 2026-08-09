package Day06;

public class deletion {

	public static void main(String[] args) {
		int[] arr = {10, 60, 30, 40, 50};

        int size = 5;
        int pos = 2;

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }}
