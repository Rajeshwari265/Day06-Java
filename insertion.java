package Day06;

public class insertion {

	public static void main(String[] args) {
		int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 50;

        int size = 4;
        int pos = 2;
        int value = 30;

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
	}}