package algorithm;

public class Merge {


    private static int[] mergeSort(int[] array, int l, int h){
        if(l == h){
            return new int[]{array[l]};
        }
        int mid = (l + h) / 2;
        int[] left = mergeSort(array, l, mid);
        int[] right = mergeSort(array, mid+1, h);
        int[] newArray = new int[left.length + right.length];

        int m=0,i=0,j=0;
        while (i < left.length && j < right.length){
            newArray[m++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length){
            newArray[m++] = left[i++];
        }
        while (j < right.length){
            newArray[m++] = right[j++];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5, 1, 8, 2};
        int[] newarr =  mergeSort(array, 0, array.length-1);
        for(int i : newarr){
            System.out.print(i + ",");
        }
    }
}
