//СОРТИРОВКА ВСТАВКАМИ

public class sort_3 {

    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 5, 1, 9, 2, 3, 6, 8, 7 };

        insertSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
    }
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
}