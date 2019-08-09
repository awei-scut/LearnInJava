package algorithm;

public class Quick {

    private static void quickSort(int[] array, int start, int end){
        if(start >= end)
            return;
        int i = start;
        int j = end;
        int base = array[start];
        while(i < j){
            while (i<j && array[j] > base){
                j--;
            }
            if(i < j){
                array[i] = array[j];
                i++;
            }
            while (i<j && array[i] < base){
                i++;
            }
            if(i < j ){
                array[j] = array[i];
                j--;
            }
        }
        array[i] = base;
        quickSort(array, start, i-1);
        quickSort(array, i+1, end);
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 5, 1, 8, 2};
        quickSort(array, 0, array.length-1);
        for(int i : array){
            System.out.print(i + ",");
        }
    }
}
