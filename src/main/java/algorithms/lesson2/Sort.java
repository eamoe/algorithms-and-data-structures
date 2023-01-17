package algorithms.lesson2;

public class Sort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};
        bubbleSort(array);

        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean keepDoing;
        do {
            keepDoing = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    keepDoing = false;
                }
            }

        } while (!keepDoing);
    }

}