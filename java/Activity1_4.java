import java.util.Arrays;

public class Activity1_4 {
	static void insertionSort(int array[]) {
		int size = array.length, i;
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
		System.out.println("Sorted Array :"+Arrays.toString(array));
	}
	
	public static void main(String args[]) {
		int[] a= {1,6,2,5,3,4};
		insertionSort(a);
	}
	
}
