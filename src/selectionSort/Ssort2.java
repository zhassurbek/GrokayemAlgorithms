package selectionSort;

public class Ssort2 {
    public static void main(String[] args) {
        int [] arr = new int[] {3, 1, 6, 2, 6, 2, 6, 44, 21, 235};
        selectionSort(arr);
        for (int a : arr)
            System.out.print(a + " ");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumIndex = i;
            int temp;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            temp = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;
        }
    }
}