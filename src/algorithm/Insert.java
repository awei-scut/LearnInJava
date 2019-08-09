package algorithm;

public class Insert {

    private static void insert(int[] array){

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i-1]){
                int temp = array[i];
                int j;
                for(j = i-1; j >= 0 && temp < array[j] ; j--){
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5, 1, 8, 2};
        insert(array);
        for(int i : array){
            System.out.print(i + ",");
        }
    }
}
