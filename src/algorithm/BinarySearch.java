package algorithm;
/*
    二分查找
 */
public class BinarySearch {
    private static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length -1 ;
        while (low <= high) {
            int mid = low + (high - low) / 2; //避免溢出
            if (array[mid] < key) {
                low = mid + 1;
            }else if (array[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[] = {1, 2 , 4 , 5 , 7, 8, 23, 26};
        int res = binarySearch(array, 23);
        System.out.println(res);
    }
}
