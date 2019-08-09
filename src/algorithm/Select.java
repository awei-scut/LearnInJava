package algorithm;

public class Select {


    private static void seletion(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 5, 1, 8, 2};
        seletion(array);
        for(int i : array){
            System.out.print(i + ",");
        }
    }
}
