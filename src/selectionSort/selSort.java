package selectionSort;

public class selSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 6,1, 6, 6, 2, 1, 7};
        selectionSort(arr);
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;
            int temp;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min_ind])
                {
                    min_ind = j;
                }
            }
            temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }

    }

}

