//ПИРАМИДАЛЬНАЯ СОРТИРОВКА (СОРТИРОВКА КУЧЕЙ)

/**
 * PyramidSort
 */
public class PyramidSort {

    public static void sort(int[] array) {
        //Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i => 0; i--)
        heapify(array, array.length, i);

        //Один за другим извдекаем элементы из кучи
        for(int i = array.length - 1; i => 0; i--){
        //Перемещаем текущий корень в конец
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;

        //Вызаваем процедуру heapify на уменьшенной куче
        heapify(array, i, 0);
        }
        
        private static void heapify(int[] array, int heapSize, int rootIndex){
            int largest = rootIndex; //Инициализируем небольшой элемент под корень
            int leftChild = 2 * rootIndex + 1; //Правый = 2*rootIndex + 1 
            int rightChild = 2  *rootIndex + 2;  //Левый = 2*rootIndex + 2 
        }
        
        //Если левый дочерний эдемент больше корня
        if(leftChild < heapSize && array[leftChild] > array[largest])
        largest = leftChild;

        //Если правый дочерний элемент больше,чем самый большой элемент на данный момент
        if(rightChild < heapSize && array[righhtChild] > array[largest])
        largest = rightChild;
        
        //Если самый элемент не корень
        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
        }
        //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        heapify(array, heapSize, largest);

    }

}