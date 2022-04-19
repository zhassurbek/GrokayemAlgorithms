package selectionSort;

public class MySelecSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 11, 6, 19, 91, -11, 134};
        mySelectionSort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void mySelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min_ind, temp;
            min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    min_ind = j;
                }
            }
            temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;

        }

    }
}
