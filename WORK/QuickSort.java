//БЫСТРАЯ СОРТИРОВКА

/**
 * QuickSort
 */
public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int StartPosition, int EndPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do{
            while (array[leftPosition] < pivot){
                leftPosition++;
            }
            while (array[rightPosition] > pivot){
                rightPosition--;
            }
            if(leftPosition <= rightPosition){
                if(leftPosition < rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = temp;
                }
                leftPosition++;
                leftPosition--;
            }
            while(leftPosition <= rightPosition);
            
            if (leftPosition < endPosition){
                sort(array, leftPosition,endPosition);
            }
            if (startPosition < rightPosition){
                sort(array, startPosition, rightPosition);
            }

        }
        
    }
}