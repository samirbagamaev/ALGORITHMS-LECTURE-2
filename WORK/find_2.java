//БИНАРНЫЙ ПОИСК

/**
 * find_2
 */
public class find_2 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(binarySearch(array, 5, 0, array.length -1));
    }
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpiont;
        if (max < min) {
            return -1;
        } else {
            midpiont = (max - min) / 2 - min;
        }
        if (array[midpiont] < value) {
            return binarySearch(value, array, midpiont + 1, max);
        } else {
            if (array[midpiont] > value) {
                return binarySearch(value, array, midpiont - 1);
            } else {
                return midpoint;
            }
        }
    }
}