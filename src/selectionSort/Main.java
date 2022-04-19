package selectionSort;



public class Main {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int position = i; // pos = 0
            int min = arr[i];   // min = 5;
            for (int j = i + 1; j < arr.length; j++){   // j = 1; j < 5; j++
                if (arr[j] < arr[i]) {
                    position = j;
                    min = arr[j];
                }
            }
            arr[position] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 2, 6, 4};
        selectionSort(arr);
        for (int i : arr)
            System.out.println(i + " ");
    }
}




//public class Main {
//    public static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[index]) {
//                    index = j;  // searching for lowest index
//                }
//            }
//            int smallerNumber = arr[index];
//            arr[index] = arr[i];
//            arr[i] = smallerNumber;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 2, 6, 4};
//        System.out.println("Before selection sort");
//        for (int i : arr)
//            System.out.println(i + " ");
//        System.out.println();
//        selectionSort(arr);
//        System.out.println("After selection sort");
//        for (int i : arr)
//            System.out.println(i + " ");
//    }
//
//}


//package selectionSort;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] myList1 = new int[]{3, 5, 2, 6, 4};
//        System.out.println(selectionSort(myList1));
//    }
//
//    public static int selectionSort(int[] myList){
//        int index_first = 0;
//        int first_elem = myList[0];
//        for (int i = 0; i < myList.length-1; i++) {
//
//        }
//    }
//}
