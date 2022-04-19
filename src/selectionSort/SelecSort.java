package selectionSort;

public class SelecSort {
    public static void main(String[] args) {

        int arr[] = new int[] {9, 8, 1, 4, 3, 6};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first_index, temp;
            first_index = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[first_index]) {
                    first_index = j;
                }
            }
            temp = arr[first_index];
            arr[first_index] = arr[i];
            arr[i] = temp;
        }
    }
}
