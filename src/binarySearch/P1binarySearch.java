package binarySearch;

public class P1binarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] my_list = {1, 3, 5, 7, 9};
        System.out.println(binary_search(new int[] {1 ,3, 5, 7, 9, 11, 13, 15}, 3) + " " +my_list[3]);
    }

    static int binary_search(int[] myList, int item) {
        int low = 0;
        int high = myList.length - 1;

        while (low <= high) {
            int mid = (low + high);
            int guess = myList[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item){
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return -1;
    }
}
