// Q.2 wap to reverse the elements of an array



import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
           int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Original Array: " + Arrays.toString(array));

        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
         
            start++;
            end--;
        }
    }
}
