package selectionSort;

public class SSort {
    public static void selectionSort(int[] a) {
        int min_ind, tmp;
        for (int i = 0; i < a.length; i++) {
            min_ind = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_ind]) {
                    min_ind = j;
                }
            }
            tmp = a[min_ind];
            a[min_ind] = a[i];
            a[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {9, 8, 1, 4, 3, 6};
        selectionSort(a);
        for (int i: a) {
            System.out.print(i + " ");
        }
    }
}
