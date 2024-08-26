package ArrayPractice;

public class RemoveElement {
    public static void main(String[] args) {

        int arr[] = new int[] { 2, 4, 5, 3, 2, 5, 3 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                }
            }
        }
        System.out.print("Removed Elements = ");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != -1) {

                System.out.print(arr[i]);
            }

    }
}
