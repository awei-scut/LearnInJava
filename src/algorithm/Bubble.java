package algorithm;

public class Bubble {

    private static void bubblSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5, 1, 8, 2};
        bubblSort(array);
        for(int i : array){
            System.out.println(i);
            System.out.println(",");
        }
    }
}
