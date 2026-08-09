package Day06;

public class searching {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

        int search = 40;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                System.out.println("Element Found at Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}
